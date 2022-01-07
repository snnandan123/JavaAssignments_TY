package com.ty.assignment;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int array[] = { 10, 20, 30, 40, 50 };
		int arr[] = new int[5];
		for (int i = 0; i <= 4; i++) {

			arr[i] = array[i];
			System.out.print("  "+arr[i]);

		}
		System.out.println("\n------------------------");
		System.arraycopy(array,0,arr,0,array.length);
		System.out.println(Arrays.toString(arr));
		
	}
}
