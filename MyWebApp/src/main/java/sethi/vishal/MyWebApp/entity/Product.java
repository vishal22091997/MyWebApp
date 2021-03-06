package sethi.vishal.MyWebApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	 
	@Column(name = "id")
	private String id;
	
	@Column(name = "no")
	private int no;
	
	@Column(name = "brand")
	private int brand;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "type")
	private int type;
	
	@Column(name = "seller")
	private int seller;
	
	public float getPrice() {
		return price;
	}

	@Column(name = "price")
	private float price;
	
	@Column(name = "discount")
	private float discount;

	@Column(name = "description")
	private String discription;
	

	@Column(name = "remarks")
	private String remarks;

	@Column(name = "ratings")
	private int ratings;
	
	@Column(name = "avail")
	private int avail;

	public int getAvail() {
		return avail;
	}

	public void setAvail(int avail) {
		this.avail = avail;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", no=" + no + ", brand=" + brand + ", name=" + name + ", type=" + type
				+ ", seller=" + seller + ", price=" + price + ", discount=" + discount + ", discription=" + discription
				+ ", remarks=" + remarks + ", ratings=" + ratings + "]";
	}

	 public Product(){
		 
	 }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Product(String id, int no, int brand, String name, int type, int seller, float price, float discount,
			String discription, String remarks, int ratings, int avail) {
	 
		this.id = id;
		this.no = no;
		this.brand = brand;
		this.name = name;
		this.type = type;
		this.seller = seller;
		this.price = price;
		this.discount = discount;
		this.discription = discription;
		this.remarks = remarks;
		this.ratings = ratings;
		this.avail = avail;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getBrand() {
		return brand;
	}

	public void setBrand(int brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getSeller() {
		return seller;
	}

	public void setSeller(int seller) {
		this.seller = seller;
	}

	 

	 

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	public Product(Product product){
		this.id = product.id;
		this.no = product.no;
		this.brand = product.brand;
		this.name = product.name;
		this.type = product.type;
		this.seller = product.seller;
		this.price = product.price;
		this.discount = product.discount;
		this.discription = product.discription;
		this.remarks = product.remarks;
		this.ratings = product.ratings;
		this.avail = product.getAvail();
		 
		
	}
	 

}
