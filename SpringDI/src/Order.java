
public class Order {
	
	private Product product;
	private Customer customer;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "order [product=" + product + ", customer=" + customer + "]";
	}

}
