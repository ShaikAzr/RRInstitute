package com.day9.questions.on.conditons;

public class EvenOddNumbers {

	// print the even and odd numbers

	public static void main(String[] args) {

		int startNumber = 1;
		int endNumber = 100;
		boolean b;
		System.out.println(" even number are =");
		for (int i = startNumber; i <= 1; i++) {

			for (int j = startNumber; j <= endNumber; j++) {
				b = (j % 2 == 0);
				if (b) {
					System.out.print(j + ",");
				}
			}
			System.out.println();
			System.out.println(" odd numbers are");
			for (int j = startNumber; j <= endNumber; j++) {
				b = (j % 2 != 0);
				if (b) {
					System.out.print(j + ",");
				}
			}

		}
	}

}
