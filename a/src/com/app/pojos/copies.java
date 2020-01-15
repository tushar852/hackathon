package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "Copies")
public class copies 
{
	
private Integer CopyId,Rack;
private String Status;
private books book;
private List<Issuerecord> Ir = new ArrayList<>();


@ManyToOne
@JoinColumn(name="Book_Id")
public books getBook() {
	return book;
}
public void setBook(books book) {
	this.book = book;
}


@OneToMany(mappedBy = "copy",cascade = CascadeType.ALL,orphanRemoval = true)
public List<Issuerecord> getIr() {
	return Ir;
}
public void setIr(List<Issuerecord> ir) {
	Ir = ir;
}

@Id 
@GeneratedValue(strategy=GenerationType.IDENTITY)
public Integer getCopyId() {
	return CopyId;
}
public void setCopyId(Integer copyId) {
	CopyId = copyId;
}
public Integer getRack() {
	return Rack;
}
public void setRack(Integer rack) {
	Rack = rack;
}

public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}
@Override
public String toString() {
	return "copies [CopyId=" + CopyId + ", Rack=" + Rack + ", Status=" + Status + ", book=" + book + ", Ir=" + Ir + "]";
}



	
}
