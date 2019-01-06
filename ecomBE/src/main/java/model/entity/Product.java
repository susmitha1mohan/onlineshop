package model.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Entity
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pId;
	@Column(name="ProductName", length=10)
	@Pattern(regexp="[^0-9]*")
	private String pName;
	@Column(name="ProductCost")
	@Size(min=2, max=4, message="The value should be between 2 digits to 4 digits")
	private String pCost;
	
	@Max(99)
	@Min(1)
	private int pQty;
	@Future
	private Date pDOM;
	

	public int getpQty() {
		return pQty;
	}
	public void setpQty(int pQty) {
		this.pQty = pQty;
	}
	public Date getpDOM() {
		return pDOM;
	}
	public void setpDOM(Date pDOM) {
		this.pDOM = pDOM;
	}
	public Product() {
		
	}
	
	public Product(String pName, String pCost, int pQty, Date pDOM) {
		super();
		this.pName = pName;
		this.pCost = pCost;
		this.pQty = pQty;
		this.pDOM = pDOM;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpCost() {
		return pCost;
	}
	public void setpCost(String pCost) {
		this.pCost = pCost;
	}
}

