package com.concept.recursion;

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println("The binary value is "+compute(-14));

	}
	private static int compute(int i) {
		if(i<0) {
			return -1;
		}
		if(i==0) {
			return 0;
		}
		return i%2 + 10*compute(i/2);
		
	}

}
