package com.concept.recursion;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The fibonacci value is "+compute(4));

	}

	private static int compute(int n) {
		// TODO Auto-generated method stub
		if(n<0) {
			return -1;
		}
		if(n==0||n==1) {
			return n;
		}
		return compute(n-1)+compute(n-2);
	}

}
