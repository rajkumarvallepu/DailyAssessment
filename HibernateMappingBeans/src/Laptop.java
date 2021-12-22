import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Laptop {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer laptopID;
	private String modelNo;

	public Integer getLaptopID() {
		return laptopID;
	}

	public void setLaptopID(Integer laptopID) {
		this.laptopID = laptopID;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

}
