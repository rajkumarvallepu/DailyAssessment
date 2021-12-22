
public class Product {

	private long productID;
	private String productName, productType;
	
	public long getProductID() {
		return productID;
	}
	public void setProductID(long productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", productType=" + productType
				+ "]";
	}
	
	
}
