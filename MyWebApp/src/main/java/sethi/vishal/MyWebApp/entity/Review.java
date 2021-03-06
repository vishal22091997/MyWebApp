package sethi.vishal.MyWebApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REVIEW")
public class Review {
	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "RATING")
	private int rating;
	
	@Column(name = "REVIEW")
	private String review;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "NO")
	private int no;
	
	@Column(name = "DAT")
	private String date;
	
	@Column(name = "REGIST")
	private int register;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getRegister() {
		return register;
	}

	public void setRegister(int register) {
		this.register = register;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", email=" + email + ", rating=" + rating + ", review=" + review + ", name=" + name
				+ ", no=" + no + ", date=" + date + ", register=" + register + "]";
	}
	
	public Review(){
		
	}

	public Review(String email, int rating, String review, String name, int no, String date, int register) {
		super();
		this.email = email;
		this.rating = rating;
		this.review = review;
		this.name = name;
		this.no = no;
		this.date = date;
		this.register = register;
	}

	 
	
}
