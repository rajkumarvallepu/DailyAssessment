package com.htd.workassignment;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.hamcrest.Matchers;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import com.htd.workassignment.controllers.RegionsController;
import com.htd.workassignment.entities.Regions;
import com.htd.workassignment.repos.RegionsRepository;

public class RegionsTest extends WorkassignmentApplicationTests{

	private MockMvc mockMvc;

	@InjectMocks
    RegionsController regionsController;
    @Mock
    RegionsRepository regionsRepository;

    @Before
    public void setUp(){
        mockMvc = MockMvcBuilders.standaloneSetup(regionsController)
                .build();
    }
    @Test
    public void getAllRegions() throws Exception {
        List<Regions> regions = Arrays.asList(new Regions());
        Mockito.when(regionsRepository.findAll()).thenReturn(regions);
        mockMvc.perform(MockMvcRequestBuilders.get("/regions/"))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }

    @Test
    public void addRegion() throws Exception {
        String jsonString = "{\n" +
                "\"regionId\":1,\n" +
                "\"name\":\"Asia\"\n" +
                "}";
        new Regions();
        mockMvc.perform(MockMvcRequestBuilders.post("/regions/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonString))
                .andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.jsonPath("$.regionId", Matchers.is(1)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name",Matchers.is("Asia")));
    }

    @Test
    public void updateRegion() throws Exception {
        String jsonString = "{\n" +
                "\"regionId\":1,\n" +
                "\"name\":\"Asia Continent\"\n" +
                "}";
        new Regions();
        mockMvc.perform(MockMvcRequestBuilders.put("/regions/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonString))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.regionId", Matchers.is(1)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name",Matchers.is("Asia Continent")));
    }

    @Test
    public void deleteRegion() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.delete("/regions/")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isAccepted());
    }
}
