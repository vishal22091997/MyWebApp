package sethi.vishal.MyWebApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "USERDETAILS")
public class User {
	@Id
	@Column(name = "ID" ) 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_MYTABLE")
	@SequenceGenerator(name = "S_MYTABLE", sequenceName = "S_MYTABLE", allocationSize = 1, initialValue = 1)
	private int id;
	
	@Column(name = "GMAILID")
	private String gmailid;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "IMAGEURL")
	private String imageurl;
	
	@Column(name = "JOIN_DATE")
	private String joinDate;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "PASSWORD")
	private String password;
	public User(){
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public User(String email, String joinDate, String name, String password) {
		super();
		this.email = email;
		this.joinDate = joinDate;
		this.name = name;
		this.password = password;
	}

	public User(String gmailid, String email, String imageurl, String joinDate, String name) {
		 
		this.gmailid = gmailid;
		this.email = email;
		this.imageurl = imageurl;
		this.joinDate = joinDate;
		this.name = name;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGmailid() {
		return gmailid;
	}

	public void setGmailid(String gmailid) {
		this.gmailid = gmailid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	 

	public User(String gmailid, String email, String imageurl, String joinDate, String name, String password) {
		super();
		this.gmailid = gmailid;
		this.email = email;
		this.imageurl = imageurl;
		this.joinDate = joinDate;
		this.name = name;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", gmailid=" + gmailid + ", email=" + email + ", imageurl=" + imageurl + ", joinDate="
				+ joinDate + "]";
	}
	
	

}
