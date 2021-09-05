package com.concept.recursion;

public class GreatestCommonDivisior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The Greatest Common Divisor is "+compute(8,4));

	}	
	private static int compute(int x, int y) {
		if(x<0||y<0) {
			return -1;
		}
		if(y==0) {
			return x;
		}		
		return compute(y, x%y);
	}

}
