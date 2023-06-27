package com.Crud.SpringbootApplication.Model;

import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "employee", uniqueConstraints = {@UniqueConstraint(columnNames = "address")})
public class Employee {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "age")
	private long age ;
	
	@Column(name = "phone")
	private String phone;
	
	
	 @Column(name = "address")
	
	private String address;
	
	@Column(name ="Status")
	private Boolean status;
	
	//new
	@Column(name="startDate")
	private Date startDate;
	
	@Column(name="team")
	private String team;
	
	@Column(name="billingRate")
	private String billingRate;
	
	@Column(name="previousIncrease")
	private Date previousIncrease;
	
	@Column(name="surname")
	private String surname;

	@Column(name="timesheet")
	private String timesheet;
	
	@Column(name="payment_type")
	private String payment_type;
	
	@Column(name="supplier")
	private String supplier;
	
	@Column(name="password")
	private String password;
	
	@Column(name="roles")
	private String roles;
	
	
	public String getRoles() {
		return roles;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setRoles(String roles) {
		this.roles = roles;
	}
	

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTimesheet() {
		return timesheet;
	}

	public void setTimesheet(String timesheet) {
		this.timesheet = timesheet;
	}

	public String getPayment_type() {
		return payment_type;
	}

	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getBillingRate() {
		return billingRate;
	}

	public void setBillingRate(String billingRate) {
		this.billingRate = billingRate;
	}

	public Date getPreviousIncrease() {
		return previousIncrease;
	}

	public void setPreviousIncrease(Date previousIncrease) {
		this.previousIncrease = previousIncrease;
	}

	
//	public Employee(long id ,String name,  long age, String phone, String address, boolean status) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.age = age;
//		this.phone = phone;
//		this.address = address;
//		this.status = status;
//		
//		
//	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	//Getters and Setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
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

	
	@Override
	public String toString() {
		return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age='" + age + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                ", startDate='" + startDate + '\'' +
                ", team='" + team + '\'' +
                ", billingRate='" + billingRate + '\'' +
                ", previousIncrease='" + previousIncrease + '\'' +
                ", billingRate='" + timesheet + '\'' +
                ", billingRate='" + payment_type + '\'' +
                ", billingRate='" + supplier + '\'' +
                ", password='" + password + '\'' +
                '}';
	}

	public Employee get() {
		Employee employee = new Employee();
		// TODO Auto-generated method stub
		return employee;
	}

	
	
	
	

}
