import static org.junit.Assert.fail;

//import org.junit.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assume.*;

public class StandardTests {
	 @BeforeAll
	    static void initAll() {
	    }
	    @BeforeEach
	    void init() {
	    }
	    @Test
	    void succeedingTest() {
	    }
	    @Test
	    void failingTest() {
	        fail("a failing test");
	    }
	    @Test
	    @Disabled("for demonstration purposes")
	    void skippedTest() {
	        // not executed
	    }
	    @Test
	    void abortedTest() {
	        assumeTrue("abc".contains("Z"));
	        fail("test should have been aborted");
	    }
	  
		@AfterEach
	    void tearDown() {
	    }
	    @AfterAll
	    static void tearDownAll() {
	    }
}
