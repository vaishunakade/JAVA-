package com.baisc;

import java.util.Scanner;

//print the month using switch case
public class Switch_case_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Eneter the month: ");
		int n = sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("plz select the 1 to 12 no");
				
		}
		
	}

}
