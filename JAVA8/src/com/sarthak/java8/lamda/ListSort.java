package com.sarthak.java8.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListSort {
public static void main(String[] args) {
	List<Integer> l=new ArrayList<>();
	l.add(10);
	l.add(0);
	l.add(5);
	l.add(20);
	l.add(15);
	System.out.println(l);
	List<Integer> list=l.stream().sorted().collect(Collectors.toList());
	System.out.println(list);
	List<Integer> list1=l.stream().sorted((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0).collect(Collectors.toList());
	System.out.println(list1);
	List<Integer> list2=l.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
	System.out.println(list2);

}
}
