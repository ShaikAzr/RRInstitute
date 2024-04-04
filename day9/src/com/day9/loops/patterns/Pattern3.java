package com.day9.loops.patterns;

public class Pattern3 {

//	print the pattern as:
//		*
//	   **	
//	  ***	
//	 ****	 
//	*****	
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("  ");

			}
			for (int j2 = 1; j2 <= i; j2++) {
				System.out.print(" *");
			}
			System.out.println();
		}

		System.out.println("-----------another waay--------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= 1; j--) {
				if (i < j) {
					System.out.print("  ");
				} else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}
}
