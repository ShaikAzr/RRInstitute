package com.day9.questions.on.conditons;

public class PrimeNumber {

	// find given number is prime or not

	public static void main(String[] args) {

		int number = 29;
		int temp = 0;

		// if any number 2 to 6 is divisble by number then its not prime

		for (int i = 2; i <= 6; i++) {

			if (number % i == 0) {

				temp++;
			}
		}
		if (temp == 0) {
			System.out.println(number + " number is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}

//-------------------------------------------another way ----------------------------------

		System.out.println("another way--------------");
		
		boolean b = true;
		for (int i = 2; i <= 6; i++) {

			if (number % i == 0) {

				b=false;
			}
		}
		if (b == true) {
			System.out.println(number + " number is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}
	}
}
