package sethi.vishal.MyWebApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//this is the class meant here for the image of size 665*750
@Entity
@Table(name = "MAINIMAGE665_750")
public class MainImageBig {
	@Id
	@Column(name = "NO")
	private int no;
	
	@Column(name = "IMAGE")
	private String image;

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

	public MainImageBig(int no, String image) {
		super();
		this.no = no;
		this.image = image;
	}
	
	public MainImageBig(){
		
	}

	@Override
	public String toString() {
		return "MainImageBig [no=" + no + ", image=" + image + "]";
	}
	
	
}
