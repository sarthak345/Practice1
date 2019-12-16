package com.sarthak.java8.lamda;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetSorting {
	public static void main(String[] args) {
		Set<Integer> tree = new TreeSet<>();
		tree.add(10);
		tree.add(0);
		tree.add(5);
		tree.add(20);
		tree.add(15);
		System.out.println(tree);
		Set<Integer> tree1 = new TreeSet<>((i1, i2) -> i2.compareTo(i1));
		tree1.add(10);
		tree1.add(0);
		tree1.add(5);
		tree1.add(20);
		tree1.add(15);
		System.out.println(tree1);
	}
}
