package model.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="CustomerDetails")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cId;
	private String cName;
	private int cAge;
	
	@OneToMany(fetch=FetchType.LAZY, targetEntity=Product.class, cascade=CascadeType.ALL)
	@JoinColumn(name="c_cid", referencedColumnName="cId")
	private List<Product> products;
	
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Customer() {
		
	}
	public Customer(String cName, int cAge) {
		super();
		this.cName = cName;
		this.cAge = cAge;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getcAge() {
		return cAge;
	}
	public void setcAge(int cAge) {
		this.cAge = cAge;
	}

}
