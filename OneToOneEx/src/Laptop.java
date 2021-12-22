import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(laptopID, modelNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(laptopID, other.laptopID) && Objects.equals(modelNo, other.modelNo);
	}
}
