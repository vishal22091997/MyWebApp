package sethi.vishal.MyWebApp.classes;

import java.util.List;

import sethi.vishal.MyWebApp.entity.Review;
import sethi.vishal.MyWebApp.entity.Seller;

public class ProductDisplay {
	private String id;
	private int no;
	private String brand;
	private String name;
	private String type;
	private Seller seller;
	private float price;
	private float dealPrice;
	private String description;
	private int rating;
	private int avail;
	private List<String> images;
	private List<Review> reviews;
	private List<String> colors;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Seller getSeller() {
		return seller;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getDealPrice() {
		return dealPrice;
	}
	public void setDealPrice(float dealPrice) {
		this.dealPrice = dealPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getAvail() {
		return avail;
	}
	public void setAvail(int avail) {
		this.avail = avail;
	}
	public List<String> getImages() {
		return images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}
	public List<Review> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	public List<String> getColors() {
		return colors;
	}
	public void setColors(List<String> colors) {
		this.colors = colors;
	}
	@Override
	public String toString() {
		return "ProductDisplay [id=" + id + ", no=" + no + ", brand=" + brand + ", name=" + name + ", type=" + type
				+ ", seller=" + seller + ", price=" + price + ", dealPrice=" + dealPrice + ", description="
				+ description + ", rating=" + rating + ", avail=" + avail + ", images=" + images + ", reviews="
				+ reviews + ", colors=" + colors + "]";
	}
	public ProductDisplay(String id, int no, String brand, String name, String type, Seller seller, float price,
			float dealPrice, String description, int rating, int avail, List<String> images, List<Review> reviews,
			List<String> colors) {
		super();
		this.id = id;
		this.no = no;
		this.brand = brand;
		this.name = name;
		this.type = type;
		this.seller = seller;
		this.price = price;
		this.dealPrice = dealPrice;
		this.description = description;
		this.rating = rating;
		this.avail = avail;
		this.images = images;
		this.reviews = reviews;
		this.colors = colors;
	}
	
	public ProductDisplay(){
		
	}
	
	
}
