package sethi.vishal.MyWebApp.classes;

import sethi.vishal.MyWebApp.entity.Product;

public class RelatedProduct extends Product{
	private String image;
	public RelatedProduct(Product product, String image){
		super(product);
		this.image = image;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "RelatedProduct [image=" + image + ", getImage()=" + getImage() + ", getPrice()=" + getPrice()
				+ ", getAvail()=" + getAvail() + ", toString()=" + super.toString() + ", getId()=" + getId()
				+ ", getNo()=" + getNo() + ", getBrand()=" + getBrand() + ", getName()=" + getName() + ", getType()="
				+ getType() + ", getSeller()=" + getSeller() + ", getDiscount()=" + getDiscount()
				+ ", getDiscription()=" + getDiscription() + ", getRemarks()=" + getRemarks() + ", getRatings()="
				+ getRatings() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
