package com.sarthak.java.collections.list;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(10);
	al.add(15);
	al.add(20);
	al.add("A");
	al.add(null);
	al.add("A");
	System.out.println(al);
	al.remove(2);
	System.out.println(al);
	al.add(2,20);
	System.out.println(al);
}
}
