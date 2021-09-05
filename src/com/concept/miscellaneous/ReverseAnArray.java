package com.concept.miscellaneous;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(reverse(array)));//--> O(1)
	}
	
	private static int[] reverse(int array[]) {
		for(int i = 0; i<array.length/2;i++) { //--------------->O(N/2)
			int other = array.length-i-1;      //---------------> O(1)
			int temp = array[i];               //---------------> O(1)
			array[i] = array[other];           //---------------> O(1)
			array[other] = temp;               //---------------> O(1)
		}		
		return array;
		//Total O(N) Time complexity
	}

}
