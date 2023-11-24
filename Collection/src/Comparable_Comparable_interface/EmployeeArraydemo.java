package Comparable_Comparable_interface;

import java.util.Arrays;

public class EmployeeArraydemo {

	public static void main(String[] args) {

		int Array[] = { 12, 32, 23, -43, -11, -23, 21 };

		System.out.println("Before Sorting :");

		for (int i = 0; i < Array.length; i++) {

			System.out.println(Array[i]);

		}
		
		Arrays.sort(Array);
		
		System.out.println("After Sorting :");
		
		for (int i = 0; i < Array.length; i++) {
			
			System.out.println(Array[i]);
			
		}
	}

}
