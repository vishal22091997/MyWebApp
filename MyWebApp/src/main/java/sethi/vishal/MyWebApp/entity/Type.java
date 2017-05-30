package sethi.vishal.MyWebApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TYPE")
public class Type {
	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(name = "TYPENAME")
	private String type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Type(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Type [id=" + id + ", type=" + type + "]";
	}

	private Type(){
		
	}

}
