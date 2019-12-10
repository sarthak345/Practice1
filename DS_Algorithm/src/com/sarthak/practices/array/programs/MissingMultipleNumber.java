package com.sarthak.practices.array.programs;

public class MissingMultipleNumber {
public static void findMissing(int[] array) {
	int[] new_array=new int[10];
	for(int i:array) {
		new_array[i]=1;
	}
	for(int i=0;i<new_array.length;i++) {
		if(new_array[i]==0) {
			System.out.println(i);
		}
	}
}
	public static void main(String[] args) {
int[] arr= {1,2,2,4,4,6,7,9,9,9};
findMissing(arr);
	}

}
