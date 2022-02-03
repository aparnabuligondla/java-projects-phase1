package com.eproduct;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="eproduct-27012022")
public class EProduct {
	@Id
	@GeneratedValue
	@Column(name="eproduct-id")
	private int id;
	
	@Column(name="eproduct-name")
	private String name;
	
	@Column(name="eproduct-price")
	private double price;
	
	
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}