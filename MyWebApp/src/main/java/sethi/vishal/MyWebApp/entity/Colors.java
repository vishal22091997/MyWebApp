package sethi.vishal.MyWebApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COLORS")
public class Colors {
	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(name = "NO")
	private int no;
	
	@Column(name = "AVAIL")
	private int avail;
	
	@Column(name = "COL")
	private String col;

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

	public int getAvail() {
		return avail;
	}

	public void setAvail(int avail) {
		this.avail = avail;
	}

	public String getCol() {
		return col;
	}

	public void setCol(String col) {
		this.col = col;
	}

	public Colors(int no, int avail, String col) {
		super();
		this.no = no;
		this.avail = avail;
		this.col = col;
	}

	public Colors(int id, int no, int avail, String col) {
		super();
		this.id = id;
		this.no = no;
		this.avail = avail;
		this.col = col;
	}

	@Override
	public String toString() {
		return "Colors [id=" + id + ", no=" + no + ", avail=" + avail + ", col=" + col + "]";
	}
	public Colors()
	{
		
	}
}
