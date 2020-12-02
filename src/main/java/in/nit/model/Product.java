package in.nit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
public class Product {
	@Id
	@GeneratedValue
	private Integer prodId;
	private String prodCode;
	private Double prodCost;
	private String prodColor;

	public Product() {
		super();
	}
     //id(PK)based contructor

	public Product(Integer prodId) {
		super();
		this.prodId = prodId;
	}
	//parameterized constructor without id(PK)

	public Product(String prodCode, Double prodCost, String prodColor) {
		super();
		this.prodCode = prodCode;
		this.prodCost = prodCost;
		this.prodColor = prodColor;
	}
	//parameterized constructor with id(PK)
	public Product(Integer prodId, String prodCode, Double prodCost, String prodColor) {
		super();
		this.prodId = prodId;
		this.prodCode = prodCode;
		this.prodCost = prodCost;
		this.prodColor = prodColor;
	}

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public Double getProdCost() {
		return prodCost;
	}

	public void setProdCost(Double prodCost) {
		this.prodCost = prodCost;
	}

	public String getProdColor() {
		return prodColor;
	}

	public void setProdColor(String prodColor) {
		this.prodColor = prodColor;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodCode=" + prodCode + ", prodCost=" + prodCost + ", prodColor="
				+ prodColor + "]";
	}
	
	
}
