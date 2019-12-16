package com.sarthak.java8.lamda;

public class Test {
public static void main(String[] args) {
	Interface1 i=new Demo();
	i.m1();
	//Lamda
	Interface1 i1=()->System.out.println("Lamda Implementation");
	i1.m1();
}
}
