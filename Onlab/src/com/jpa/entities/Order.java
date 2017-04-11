package com.jpa.entities;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="order")
public class Order {
	
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;
	
	//@ManyToMany(mappedBy="order")
	//@JoinColumn(name="foodId")
//	private Collection<Food> foods;
	
	@Id
	private int orderId;
	
	@Column(name="order_date")
	private Date orderDate;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	//todo!!
	

}
