package com.concept.bigONotation;

public class PrintUnorderedPairsFromAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compute(new int[] {2,4,6,8});
		compute(new int[] {1,3,5,7,9}, new int[] {0,2,4,6,8,10,12,14});
	}	
	private static void compute(int[] values) {
		// Solution One
		System.out.print("The unordered list is ");
		for(int i =0;i<values.length;i++) {
			for(int j =i+1;j<values.length;j++) {
				System.out.print(values[i]+""+values[j]+",");
			}
		}
		//Time Complexity calculation
		/*
		 * Count Iterations
		 * inner loop
		 * 1st ---> n-1
		 * 2nd ---> n-2
		 * .
		 * .
		 * .
		 * nth ---> 1
		 * (n-1)+(n-2)+(n-3)+...+2+1
		 * =1+2+...+(n-2)+(n-1)+n
		 * =n(n-1)/2
		 * =n^2/2 - n/2  ----(n/2)-->non dominant terms so can be removed
		 * =n^2 is the time complexityO(n^2)
		 */
	}
	private static void compute(int[] is, int[] is2) {
		// TODO Auto-generated method stub
		
	}

}
