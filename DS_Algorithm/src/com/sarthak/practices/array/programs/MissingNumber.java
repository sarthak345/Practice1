package com.sarthak.practices.algorithm;

public class MissingNumber {
	public static int findmissing(int[] arr) {
		int n=arr.length+1;
		int total_sum=0;
		for(int i:arr) {
			total_sum +=i;
		}
		int sum=n*(n+1)/2;
		int missinNumber=sum-total_sum;
		
		return missinNumber;
	}
public static void main(String[] args) {
	int[] array= {1,2,3,5,6,7,8};
	System.out.println(findmissing(array));
}
}
