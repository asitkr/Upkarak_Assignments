package com.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class FindLargestElementFromArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(findLargest(arr, n));
	}
	
	public static int findLargest(int[] arr, int n) {
		if(n == 0) {
			return 0;
		}
		
		int max = arr[0];
		
		for(int i=1; i<n; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
	}

}
