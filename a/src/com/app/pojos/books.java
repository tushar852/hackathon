package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "Books")
public class books 
{
	private Integer BookId;
	private String Name,Author,Subject,ISBN;
	private double Price;
	private List<copies> copies = new ArrayList<>();
	public books() {
		// TODO Auto-generated constructor stub
	}
	

	public books(Integer bookId, String name, String author, String subject, String iSBN, double price,
			List<com.app.pojos.copies> copies) {
		super();
		BookId = bookId;
		Name = name;
		Author = author;
		Subject = subject;
		ISBN = iSBN;
		Price = price;
		this.copies = copies;
	}


	@OneToMany(mappedBy = "book",cascade = CascadeType.ALL,orphanRemoval = true)
	public List<copies> getCopies() {
		return copies;
	}
	public void setCopies(List<copies> copies) {
		this.copies = copies;
	}
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getBookId() {
		return BookId;
	}
	public void setBookId(Integer bookId) {
		BookId = bookId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "books [BookId=" + BookId + ", Name=" + Name + ", Author=" + Author + ", Subject=" + Subject + ", ISBN="
				+ ISBN + ", Price=" + Price + "]";
	}
	
}
