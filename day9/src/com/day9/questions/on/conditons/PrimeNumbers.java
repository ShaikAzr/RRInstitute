package com.day9.questions.on.conditons;

public class PrimeNumbers {

	// print prime numbers from 1 to 100;

	public static void main(String[] args) {
		int temp = 0;
		for (int i = 2; i <= 100; i++) {

			for (int j = 2; j <= i / 2; j++) {

				if (i % j == 0) {
					temp++;
				}
			}
			if (temp == 0) {
				System.out.println(i);
			} else {
				temp = 0;
			}
		}
		// ----------------------------------------------------
System.out.println("-----------------another method--------------------------------------------------");
		for (int i = 2; i <= 100; i++) {
			boolean b = true;
			for (int j = 2; j <= i-1; j++) {

				if (i % j == 0) {
					b = false;
				}
			}
			if (b == true) {
				System.out.println(i);
			} else {
				b = true;
			}
		}
	}
}
