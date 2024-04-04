package com.day9.questions.on.conditons;

public class ReverseNumber {

	public static void main(String[] args) {

		int number= 2345;
		
		int remind;
		int reverse=0;
		while (number>0) {
			
			remind = number%10;
			reverse = reverse*10+remind;
			number=number/10;
		}
		
		System.out.println(reverse);
	}

}
