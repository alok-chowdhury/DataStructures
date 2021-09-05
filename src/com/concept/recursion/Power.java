package com.concept.recursion;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The Power value is "+compute(3,3));
	}
	private static int compute(int base, int exp) {
		if(exp<0) {
			return -1;
		}
		if(exp==0) {
			return 1;
		}
		return base*compute(base,exp-1);
	}

}
