package com.concept.recursion;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The sum of digits is "+compute(120));

	}
	
	private static int compute(int n) {
		if(n<=0) {
			return 0;
		}
		return n%10 + compute(n/10);
	}

}
