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
@Table(name = "Issues")
public class Issuerecord 
{
	

private users user;
private Integer IssueId;
private copies copy;
private LocalDate IssuedOn,ReturnDate,DueDate;
private double Fine;


public Issuerecord() {
	// TODO Auto-generated constructor stub
}

public Issuerecord(users user, Integer issueId, copies copy, LocalDate issuedOn, LocalDate returnDate,
		LocalDate dueDate, double fine) {
	super();
	this.user = user;
	IssueId = issueId;
	this.copy = copy;
	IssuedOn = issuedOn;
	ReturnDate = returnDate;
	DueDate = dueDate;
	Fine = fine;
}
@Id 
@GeneratedValue(strategy=GenerationType.IDENTITY)
public Integer getIssueId() {
	return IssueId;
}

public void setIssueId(Integer issueId) {
	IssueId = issueId;
}


@ManyToOne
@JoinColumn(name="member_id")

public users getUser() {
	return user;
}

@ManyToOne
@JoinColumn(name="copy_id")
public copies getCopy() {
	return copy;
}
public void setCopy(copies copy) {
	this.copy = copy;
}
public LocalDate getIssuedOn() {
	return IssuedOn;
}
public void setIssuedOn(LocalDate issuedOn) {
	IssuedOn = issuedOn;
}
public LocalDate getReturnDate() {
	return ReturnDate;
}
public void setReturnDate(LocalDate returnDate) {
	ReturnDate = returnDate;
}
public LocalDate getDueDate() {
	return DueDate;
}
public void setDueDate(LocalDate dueDate) {
	DueDate = dueDate;
}
public double getFine() {
	return Fine;
}
public void setFine(double fine) {
	Fine = fine;
}
public void setUser(users user) {
	this.user = user;
}
@Override
public String toString() {
	return "Issuerecord [user=" + user + ", IssueId=" + IssueId + ", copy=" + copy + ", IssuedOn=" + IssuedOn
			+ ", ReturnDate=" + ReturnDate + ", DueDate=" + DueDate + ", Fine=" + Fine + "]";
}




}
