package com.test;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
	
	
	private int id;
	private String name;
	
	public Employee() {
		
	}
	
	
	
	

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}





	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}





	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}





	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return ;
	}





	
	
}
