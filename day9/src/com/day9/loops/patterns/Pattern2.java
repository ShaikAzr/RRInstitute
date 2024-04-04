package com.day9.loops.patterns;

public class Pattern2 {

//	print reverse pattern
//	*****
//	****
//	***
//	**
//	*

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i <= j) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

		System.out.println("------------------another way--------");

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
