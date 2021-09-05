package com.concept.bigONotation;

public class SumAndProductOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compute(new int[] {1,3,5,2,1});

	}
	private static void compute(int[] values) {
		int sum = 0, product = 1;//------>O(1)
		for(int a : values) {//---------->O(N)
			sum+=a;//-------------------->O(1)
			product*=a;//---------------->O(1)
		}
		System.out.print("The sum of the array is "+sum);//---->O(1)
		System.out.println(" and its product is "+product);//-->O(1)
	}
//Total Complexity is O(N)
}
