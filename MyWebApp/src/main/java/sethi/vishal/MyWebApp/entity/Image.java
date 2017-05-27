package sethi.vishal.MyWebApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "IMAGE_NAMES")
public class Image {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "no")
	private int no; 
	@Column(name = "image")
	private String image;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Image(int id, int no, String image) {
		super();
		this.id = id;
		this.no = no;
		this.image = image;
	}
	public Image(){
		
	}
	 
}
