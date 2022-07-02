package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee(1,"Thiru");
		Employee employee1 = new Employee(1,"Ajay");
		Employee employee2 = new Employee(1,"thilak");
		Employee employee3 = new Employee(1,"tHomas");
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(employee);
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		
		List<String> Duplicates=employees.stream().map(Employee::getName).collect(Collectors.toList());
		List<String>filtering=Duplicates.stream().filter(r->r.startsWith("t") || r.startsWith("T") ).collect(Collectors.toList());
		
		filtering.stream().map(players -> players.toUpperCase()).forEach(players -> System.out.print(players + " "));
		/*
		 * String namesJoined = names.stream() .map(String::toUpperCase)
		 * .peek(System.out::println) .collect(Collectors.joining());
		 * Duplicates.forEach(System.out::println);
		
		/*
		 * List<String>
		 * employeeListWithoutDuplicates=employees.stream().map(Employee::getName).
		 * collect(Collectors.toList());
		 * System.out.println(employeeListWithoutDuplicates.size());
		 * 
		 * for(String employeee:employeeListWithoutDuplicates) {
		 * System.out.println(employeee); }
		 */
		
		
		
		
		
		
					
				
		
		
	}

}


//[Thiru, Ajay, thilak, tHomas]