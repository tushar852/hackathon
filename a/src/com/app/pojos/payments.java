package com.app.pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Payments")
public class payments 
{
	private Integer PaymentId;
	private double amount;
	private users user;
	private String Type;
	private LocalDate TxTime,DueDate;
	
	public payments() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public payments(Integer paymentId, double amount, users user, String type, LocalDate txTime, LocalDate dueDate) {
		super();
		PaymentId = paymentId;
		this.amount = amount;
		this.user = user;
		Type = type;
		TxTime = txTime;
		DueDate = dueDate;
	}



	@ManyToOne
	@JoinColumn(name = "User_Id")
	public users getUser() {
		return user;
	}
	public void setUser(users user) {
		this.user = user;
	}
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getPaymentId() {
		return PaymentId;
	}
	public void setPaymentId(Integer paymentId) {
		PaymentId = paymentId;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public LocalDate getTxTime() {
		return TxTime;
	}
	public void setTxTime(LocalDate txTime) {
		TxTime = txTime;
	}
	public LocalDate getDueDate() {
		return DueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		DueDate = dueDate;
	}
	@Override
	public String toString() {
		return "payments [PaymentId=" + PaymentId + ", amount=" + amount + ", user=" + user + ", TxTime=" + TxTime
				+ ", DueDate=" + DueDate + ", Type=" + Type + "]";
	}
	

}
