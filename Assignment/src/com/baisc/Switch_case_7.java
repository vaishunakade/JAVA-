package com.baisc;

import java.util.Scanner;

//Write a Java program to enter number between 1 to 5 and print it in word
public class Switch_case_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int n = sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		default:
			System.out.println("Invalid no ");
			break;
		}

	}

}
