package com.tts.Restaurant.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Restaurant {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String phone;
	private String address;
	private String owner;
	
	public Restaurant() {

	}
public Restaurant(String name, String owner, String phoneNumber, String address) {
	this.name= name;
	this.owner= owner;
	this.phone = phoneNumber;
	this.address = address;
}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + ", owner="
				+ owner + "]";
	}

}
	