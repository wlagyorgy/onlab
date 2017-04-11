package com.jpa.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="menu")


public class Menu {
	
	@ManyToOne
	@JoinColumn(name="restaurantId")
	private Restaurant restaurant;
	
	@OneToOne
	@JoinColumn(name="menucatId")
	private MenuCategory menucat;
	
	@Id
	private int menuId;
	
	private String name;
	
	private String category;
	
	@Column(name="price_category")
	private String priceCategory;

	public int getRestaurantId() {
		return menuId;
	}

	public void setRestaurantId(int menuId) {
		this.menuId = menuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPriceCategory() {
		return priceCategory;
	}

	public void setPriceCategory(String priceCategory) {
		this.priceCategory = priceCategory;
	}
	
	

}
