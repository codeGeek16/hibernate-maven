package com.galaxe.Pojo;

public class Address {

	private int id;
	private String street;
	private String state;
	private String city;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(int id, String street, String state, String city) {
		super();
		this.id = id;
		this.street = street;
		this.state = state;
		this.city = city;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", state=" + state
				+ ", city=" + city + "]";
	}
	
	
}
