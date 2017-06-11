package sethi.vishal.MyWebApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CONTACTMESSAGE")
public class ContactMessage {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CONTACTMESSAGE_SEQ")
	@SequenceGenerator(name = "CONTACTMESSAGE_SEQ", sequenceName = "CONTACTMESSAGE_SEQ", allocationSize = 1, initialValue = 1)
	private int id;
	
	@Column(name = "USER_ID")
	private int user_id;
	
	@Column(name = "MESSAGE")
	private String message;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ContactMessage [id=" + id + ", user_id=" + user_id + ", message=" + message + "]";
	}

	public ContactMessage(int id, int user_id, String message) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.message = message;
	}
	
	public ContactMessage(int user_id, String message) {
		 
		this.user_id = user_id;
		this.message = message;
	}

	public ContactMessage(){
		
	}
	
}
