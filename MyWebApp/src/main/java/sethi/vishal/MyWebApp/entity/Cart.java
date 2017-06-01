package sethi.vishal.MyWebApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id ;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CART")

public class Cart {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CART_SEQU")
	@SequenceGenerator(name = "CART_SEQU", sequenceName = "CART_SEQU", allocationSize = 1, initialValue = 1)
	private int id;
	
	@Column(name = "COUNT")
	private int count;
	
	@Column(name = "PRODUCT_ID")
	private String productId;
	
	@Column(name = "CUST_ID")
	private int custId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", count=" + count + ", productId=" + productId + ", custId=" + custId + "]";
	}

	public Cart(int count, String productId, int custId) {
		super();
		this.count = count;
		this.productId = productId;
		this.custId = custId;
	}
	
	public Cart(){
		
	}
	
}
