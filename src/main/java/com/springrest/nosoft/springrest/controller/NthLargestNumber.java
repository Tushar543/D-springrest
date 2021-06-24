package com.springrest.nosoft.springrest.controller;

public class NthLargestNumber {

	public static int getThirdLargest(int[] a,int total) {
		int temp;
		for(int i=0;i<total;i++) {
			for(int j=1+1;j<total;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-2];
	}
	public static void main(String args[]) {
		int a[]= {1,3,5,2,7,8};
		System.out.println("Third Largest"+getThirdLargest(a, 6));
	}
}
