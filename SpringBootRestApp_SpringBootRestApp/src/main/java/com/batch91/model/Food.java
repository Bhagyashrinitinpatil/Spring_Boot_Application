/**
 * 
 */
package com.batch91.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author BHAGYASHRI
 *
 */
@Entity
public class Food {

	@Id
	private int id;
	private String name;
	private double price;
	
	
	/**
	 * 
	 */
	public Food() {
		super();
	}
	/**
	 * @param id
	 * @param name
	 * @param price
	 */
	public Food(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
