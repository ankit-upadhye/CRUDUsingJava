package com.ankit.entity;

public class Person {

	private int personid;
	private String person_name;
	private String address;
	private String city;
	private String contactno;
	private int fklicenseid;
	
	public Person() {}
	public Person(int personid, String person_name, String address, String city, String contactno, int fklicenseid) {
		super();
		this.personid = personid;
		this.person_name = person_name;
		this.address = address;
		this.city = city;
		this.contactno = contactno;
		this.fklicenseid = fklicenseid;
	}
	
	public int getPersonid() {
		return personid;
	}
	
	public String getPerson_name() {
		return person_name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getContactno() {
		return contactno;
	}
	
	public int getFklicenseid() {
		return fklicenseid;
	}
	
	
	@Override
	public String toString() {
		return "Person [personid=" + personid + ", person_name=" + person_name + ", address=" + address + ", city="
				+ city + ", contactno=" + contactno + ", fklicenseid=" + fklicenseid + "]";
	}
	
	

	
	
	
	
}
