package model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Product {
	@Id
	private int pId;
	private String pName;
	private String pCost;
	public Product(int pId, String pName, String pCost) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pCost = pCost;
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
