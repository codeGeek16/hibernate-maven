package com.galaxe.Pojo;


public class Employee 
{
    private int id;
    private String firstName,lastName;
    private Address addr;
    
	public Employee(int id, String firstName, String lastName, Address addr) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.addr = addr;
	}
	
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
    
    
}
