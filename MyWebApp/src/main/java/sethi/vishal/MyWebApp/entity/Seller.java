package sethi.vishal.MyWebApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id ;
import javax.persistence.Table;

@Entity
@Table(name = "SELLER")
public class Seller {
	@Id
	@Column(name = "ID")
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

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", address=" + address + ", contact=" + contact + ", rating="
				+ rating + ", email=" + email + ", joinDate=" + joinDate + "]";
	}
	
	public Seller(){
		
	}

	public Seller(int id, String name, String address, long contact, int rating, String email, String joinDate) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.rating = rating;
		this.email = email;
		this.joinDate = joinDate;
	}
	
}
