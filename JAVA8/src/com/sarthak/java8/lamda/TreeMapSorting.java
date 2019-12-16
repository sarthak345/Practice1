package com.sarthak.java8.lamda;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSorting {

	public static void main(String[] args) {
Map<Integer,String> map=new TreeMap<>();
map.put(100, "Sarthak");
map.put(200, "Sipu");
map.put(500, "Papu");
map.put(300, "Liza");
map.put(150, "Jasmin");
map.put(700, "ALok");
System.out.println(map);
Map<Integer,String> map1=new TreeMap<Integer,String>((i1,i2)->i2.compareTo(i1));
map1.put(100, "Sarthak");
map1.put(200, "Sipu");
map1.put(500, "Papu");
map1.put(300, "Liza");
map1.put(150, "Jasmin");
map1.put(700, "ALok");
System.out.println(map1);

	}

}
