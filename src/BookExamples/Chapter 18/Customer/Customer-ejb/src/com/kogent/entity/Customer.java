package com.kogent.entity;

import java.util.List;
import javax.persistence.*;

@Entity
public class Customer implements java.io.Serializable {

	private Integer customerId;
	private String firstName;
	private String lastName;
	private String company;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zip;
	private String emailAddress;
	private String phoneNumber;

	public Customer() {
		firstName = "";
		lastName = "";
		company = "";
		address1 = "";
		address2 = "";
		city = "";
		state = "";
		zip = "";
		emailAddress = "";
		phoneNumber = "";
	}

	@Id
	@Column(name="custId", insertable=false, updatable=false)
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Column(name="address_1")
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	@Column(name="address_2")
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static List<Customer> findAllCustomers(EntityManager em) {
		Query query = em.createQuery(
			"SELECT OBJECT(cust) FROM Customer cust");
		List<Customer> customers = query.getResultList();
	return customers;
	}

	public static Customer findCustomerById(EntityManager em, int custId) {
	
	Query query = em.createQuery(
		"SELECT OBJECT(cust) FROM Customer cust "
			+ "WHERE cust.customerId = :custId");
		System.out.println("customerid in customer"+custId);
		query.setParameter("custId",custId);
		Customer customer = (Customer)query.getSingleResult();
		return customer;
	}

}
