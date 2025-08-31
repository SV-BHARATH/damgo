

package com.example.SpringMailSender.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="damgo_Register")
public class Register 
{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	private String phoneno;
	
	private String state ;
	
	private String district;
	
	private String acres;
	
	private String email;
	
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getAcres() {
		return acres;
	}

	public void setAcres(String acres) {
		this.acres = acres;
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

	public Register(String name, String phoneno, String state, String district, String acres, String email,
			String password) {
		super();
		this.name = name;
		this.phoneno = phoneno;
		this.state = state;
		this.district = district;
		this.acres = acres;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Resigter [name=" + name + ", phoneno=" + phoneno + ", state=" + state + ", district=" + district
				+ ", acres=" + acres + ", email=" + email + ", password=" + password + "]";
	}
	
	
	

}
