package com.baisc;
//Check vowal or consonant
import java.util.Scanner;

public class Switch_case_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ch ");
		char ch = sc.next().charAt(0);
		switch(ch)
		{
		case ('A'):
			System.out.println(ch + " is vowal ");
			break;
		case 'E':
			System.out.println(ch + " is vowal ");
			break;
		case 'I':
			System.out.println(ch + " is vowal ");
			break;
		case 'O':
			System.out.println(ch + " is vowal ");
			break;
		case 'U':
			System.out.println(ch + " is vowal ");
			break;
		default:
			System.out.println(ch + " is consonant");
			break;
		}
	}
}
