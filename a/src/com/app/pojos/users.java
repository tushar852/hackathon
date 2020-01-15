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
@Table(name = "Users")
public class users 
{

		private Integer Id;
		private String Name,Email,Password,Phone,Role;
		private List<payments> Ir1 = new ArrayList<>();
		private List<Issuerecord> Ir = new ArrayList<>();
		
		public users() {
			// TODO Auto-generated constructor stub
		}
		
		
		public users(Integer id, String name, String email, String password, String phone, String role,
				List<payments> ir1, List<Issuerecord> ir) {
			super();
			Id = id;
			Name = name;
			Email = email;
			Password = password;
			Phone = phone;
			Role = role;
			Ir1 = ir1;
			Ir = ir;
		}


		@OneToMany(mappedBy = "user",cascade = CascadeType.ALL, orphanRemoval = true)
		public List<payments> getIr1() {
			return Ir1;
		}

		public void setIr1(List<payments> ir1) {
			Ir1 = ir1;
		}


		@OneToMany(mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true)
		public List<Issuerecord> getIr() {
			return Ir;
		}


		public void setIr(List<Issuerecord> ir) {
			Ir = ir;
		}

		@Id 
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		public Integer getId() {
			return Id;
		}
		public void setId(Integer id) {
			Id = id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		public String getPhone() {
			return Phone;
		}
		public void setPhone(String phone) {
			Phone = phone;
		}
		public String getRole() {
			return Role;
		}
		public void setRole(String role) {
			Role = role;
		}


		@Override
		public String toString() {
			return "users [Id=" + Id + ", Name=" + Name + ", Email=" + Email + ", Password=" + Password + ", Phone="
					+ Phone + ", Role=" + Role + ", Ir=" + Ir + "]";
		}
	
	
}
