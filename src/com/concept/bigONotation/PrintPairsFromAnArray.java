package com.concept.bigONotation;

public class PrintPairsFromAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compute(new int[] {1,3,5,7,9});

	}
	private static void compute(int[] values) {
		System.out.print("The PrintPair values are ");//-->O(1)
		for(int a : values) {//--------------------------->O(N)  |O(N^2)
			for(int b : values) {//----------------------->O(N)  |  
				System.out.print(a+""+b+",");//---------->O(1)
			}
		}
	}
	//Time complexity is O(N^2)

}
