package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class LoginVO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;

	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "LoginVO [id=" + id + ", email=" + email + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}
		
}
