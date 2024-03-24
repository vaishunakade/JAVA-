package com.baisc;

import java.util.Scanner;

// Write a program that displays the day of the week corresponding to the number 
// entered. i.e.  1 - "Monday", 2- "Tuesday" and so on.

public class Switch_case_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int n = sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("Mon");
			break;
		case 2:
			System.out.println("Tue");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 4:
			System.out.println("Thu");
			break;
		case 5:
			System.out.println("Fri");
			break;
		case 6:
			System.out.println("Sat");
			break;
		case 7: 
			System.out.println("Sun");
			break;
		default:
			System.out.println("Invalid day");
			break;
			
		}
	}
}
