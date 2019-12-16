package com.sarthak.java8.lamda;

public class Test1 {
public static void main(String[] args) {
	Interface2 i1=new Demo1();
	i1.add(10, 100);
	
	Interface2 i2=(a,b)->System.out.println("Lamda Implementation"+a+b);
	i2.add(100, 120);
}
}
