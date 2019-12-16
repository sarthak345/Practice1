package com.sarthak.java8.lamda;

public class Demo1 implements Interface2 {

	@Override
	public void add(int a, int b) {
		System.out.println("Normal Implementation");
		System.out.println(a+b);
	}

}
