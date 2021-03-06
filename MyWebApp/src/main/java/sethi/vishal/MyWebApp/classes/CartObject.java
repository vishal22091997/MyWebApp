package sethi.vishal.MyWebApp.classes;

import sethi.vishal.MyWebApp.entity.Product;

public class CartObject  {
	private Product product;
	private String image;
	private int count;
	private int id;
	public CartObject(Product product, String image, int count, int id) {
		super();
		this.product = product;
		this.image = image;
		this.count = count;
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "DisplayCart [product=" + product + ", image=" + image + ", count=" + count + "]";
	}
	 
	
	 

}
