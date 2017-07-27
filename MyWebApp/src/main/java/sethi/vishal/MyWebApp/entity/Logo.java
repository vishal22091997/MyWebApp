package sethi.vishal.MyWebApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "LOGOS")
public class Logo {
	@Id																		
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOGOS_SEQ")
	@SequenceGenerator(name = "LOGOS_SEQ", sequenceName = "LOGOS_SEQ", allocationSize = 1, initialValue = 1)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="rank")				
	private int rank;

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

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Logo [id=" + id + ", name=" + name + ", rank=" + rank + "]";
	}

	public Logo(String name, int rank) {
		super();
		this.name = name;
		this.rank = rank;
	}
	public Logo(){
		
	}
	
}
