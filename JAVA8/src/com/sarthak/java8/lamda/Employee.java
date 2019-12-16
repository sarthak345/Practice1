package com.sarthak.java8.lamda;

public class Employee {
int id;
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
String name;
public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}
}
