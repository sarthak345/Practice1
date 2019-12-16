package com.sarthak.java8.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Employee> empoyee=new ArrayList<Employee>();
empoyee.add(new Employee(12,"sarthak"));
empoyee.add(new Employee(15,"liza"));
empoyee.add(new Employee(16,"sipu"));
empoyee.add(new Employee(13,"jasmin"));
empoyee.add(new Employee(11,"alok"));
List<Employee> empoyeesort=empoyee.stream().sorted((i1,i2)->i2.getName().compareTo(i1.getName())).collect(Collectors.toList());
System.out.println(empoyeesort);
	}

}
