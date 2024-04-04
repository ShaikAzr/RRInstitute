package com.day9.arrays;

public class Question1 {
//	Write 5 Programs on Array. (Declaration/ Initialization/Assigning values with the index & Accessing values with index)

	public static void main(String[] args) {
// 1 time
		int i[]; // declaration
		i = new int[7]; // intialization
		i[0] = 1; // assignig
		i[1] = 2;
		i[2] = 3;
		i[3] = 4;
		i[4] = 5;
		i[5] = 6;
		i[6] = 7;

		System.out.println("index 0 =" + i[0]);
		System.out.println("index 1 =" + i[1]);
		System.out.println("index 2 =" + i[2]);
		System.out.println("index 3 =" + i[3]);
		System.out.println("index 4 =" + i[4]);
		System.out.println("index 5 =" + i[5]);
		System.out.println("index 6 =" + i[6]);

		System.out.println();
		System.out.println("-----2nd time----");

		int[] a; // declation
		a = new int[2];
		a[0] = 1;
		a[1] = 2;
		System.out.println(a[0]);
		System.out.println(a[1]);

	}
}
