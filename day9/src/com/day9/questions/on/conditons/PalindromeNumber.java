package com.day9.questions.on.conditons;

public class PalindromeNumber {

// reverse also it should be same

	public static void main(String[] args) {
		int number = 324332;

		int temp = number;
		int reminder;
		int reverse = 0;

		while (temp > 0) {

			reminder = temp % 10;
			reverse = reverse * 10 + reminder;
			temp = temp / 10;
			
		}
		
		if (reverse==number) {
			
			System.out.println("Given number is palidrome");
		}
		else {
			System.out.println("it is not palindrom");
		}
	}

}
