package com.day9.loops.patterns;

public class Pattern1 {

	public static void main(String[] args) {

//		*
//		**
//		***
//		****
//		*****

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("-------------another way o executiion-----------");

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				if (i >= j) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
