package sethi.vishal.MyWebApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id ;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SELLER")
public class Seller {
	@Id
	@Column(name = "ID" ) 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SELLER_SEQ")
	@SequenceGenerator(name = "SELLER_SEQ", sequenceName = "SELLER_SEQ", allocationSize = 1, initialValue = 1)
	private int id;
	
	@Column(name = "NAME") 
	private String name;
	
	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "CONTACT_NO")
	private long contact;
	
	@Column(name = "RATING")
	private int rating;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "JOIN_DATE")
	private String joinDate;
	
	@Column(name = "PINCODE")
	private int pincode;
	
	@Column(name="USER_ID")
	private int userId;
	
	@Column(name = "VERIFIED")
	private int verified;
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getVerified() {
		return verified;
	}

	public void setVerified(int verified) {
		this.verified = verified;
	}

	 

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Seller(String name, String address, long contact, int rating, String email, String joinDate, int pincode,
			int userId, int verified) {
		super();
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.rating = rating;
		this.email = email;
		this.joinDate = joinDate;
		this.pincode = pincode;
		this.userId = userId;
		this.verified = verified;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	
	

	public Seller(String name, String address, long contact, String email, String joinDate, int pincode, int userId) {
		super();
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.email = email;
		this.joinDate = joinDate;
		this.pincode = pincode;
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", address=" + address + ", contact=" + contact + ", rating="
				+ rating + ", email=" + email + ", joinDate=" + joinDate + "]";
	}
	
	public Seller(){
		
	}

	 
	
}
