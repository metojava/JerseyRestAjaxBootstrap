package com.mycompany;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.internal.txw2.annotation.XmlElement;

@XmlRootElement(name = "Employee")
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double salary;
	private int age;
	private Date bdate;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary, int age, Date bdate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.bdate = bdate;
	}

	public Date getBdate() {
		return bdate;
	}

	@XmlElement
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	public int getId() {
		return id;
	}

	@XmlElement
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	@XmlElement
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	@XmlElement
	public void setAge(int age) {
		this.age = age;
	}

}
