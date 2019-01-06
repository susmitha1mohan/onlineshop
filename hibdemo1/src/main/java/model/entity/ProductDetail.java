package model.entity;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ProductDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pdid;
	
	private String pfeatures;
	private Date pdate;
	
	@OneToOne(targetEntity=Product.class,cascade=CascadeType.ALL)
	@JoinColumn(name="pd_pId",referencedColumnName="pId")
	private Product parent;

	public int getPdid() {
		return pdid;
	}

	public void setPdid(int pdid) {
		this.pdid = pdid;
	}

	public String getPfeatures() {
		return pfeatures;
	}

	public void setPfeatures(String pfeatures) {
		this.pfeatures = pfeatures;
	}

	public Date getPdate() {
		return pdate;
	}

	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}

	public Product getParent() {
		return parent;
	}

	public void setParent(Product parent) {
		this.parent = parent;
	}

}
