package com.Crud.SpringbootApplication.Model;

import javax.persistence.*;

@Entity
@Table(name = "worker")
public class Worker {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employ_id")
	private long employ_id;
	
	@Column(name = "employ_name")
	private String employ_name;
	
	@Column(name = "employ_surname")
	private String employ_surname;
	
	@Column(name = "employ_role")
	private String employ_role;
	
	@Column(name = "employ_team")
	private String employ_team;
	
	@Column(name = "employ_cellnumber")
	private String employ_cellnumber;
	
	@Column(name = "employ_email")
	private String employ_email;
	
	@Column(name = "employ_status")
	private String employ_status;

	public long getEmploy_id() {
		return employ_id;
	}

	public void setEmploy_id(long employ_id) {
		this.employ_id = employ_id;
	}

	public String getEmploy_name() {
		return employ_name;
	}

	public void setEmploy_name(String employ_name) {
		this.employ_name = employ_name;
	}

	public String getEmploy_surname() {
		return employ_surname;
	}

	public void setEmploy_surname(String employ_surname) {
		this.employ_surname = employ_surname;
	}

	public String getEmploy_role() {
		return employ_role;
	}

	public void setEmploy_role(String employ_role) {
		this.employ_role = employ_role;
	}

	public String getEmploy_team() {
		return employ_team;
	}

	public void setEmploy_team(String employ_team) {
		this.employ_team = employ_team;
	}

	public String getEmploy_cellnumber() {
		return employ_cellnumber;
	}

	public void setEmploy_cellnumber(String employ_cellnumber) {
		this.employ_cellnumber = employ_cellnumber;
	}

	public String getEmploy_email() {
		return employ_email;
	}

	public void setEmploy_email(String employ_email) {
		this.employ_email = employ_email;
	}

	public String getEmploy_status() {
		return employ_status;
	}

	public void setEmploy_status(String employ_status) {
		this.employ_status = employ_status;
	}
	
	
	@Override
	public String toString() {
		return "Employee{" +
                "employ_id=" + employ_id +
                ", employ_name='" + employ_name + '\'' +
                ", employ_surname='" + employ_surname + '\'' +
                ", employ_role='" + employ_role + '\'' +
                ", employ_team='" + employ_team + '\'' +
                ", employ_cellnumber='" + employ_cellnumber + '\'' +
                ", employ_email='" + employ_email + '\'' +
                ", employ_status='" + employ_status + '\'' +
                '}';
	}
	
	public Worker get() {
		Worker worker = new Worker();
		// TODO Auto-generated method stub
		return worker;
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
	
	
	

	
//	@Override
//	public String toString() {
//		return "Employee{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", age='" + age + '\'' +
//                ", phone='" + phone + '\'' +
//                ", address='" + address + '\'' +
//                ", status='" + status + '\'' +
//                '}';
//	}

	

	
	
	
	

}
