package com.concept.recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The factorial value is "+compute(4));
	}
	
	private static int compute(int n) {
		if(n<0) {
			return -1;
		}
		if(n==0||n==1) {
			return 1;
		}
		return n*compute(n-1);
	}

}
