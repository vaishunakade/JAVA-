package com.baisc;
//Operation Add,Sub,Mul,Div
import java.util.Scanner;

public class Switch_case_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the n1: ");
		int n1 = sc.nextInt();
		System.out.println("Enter the n2: ");
		int n2 = sc.nextInt();
		System.out.println("Enter the menu(Add,Sub,Mul,Div)");
	    String opertor = sc.next();
		switch(opertor)
		{
		case "add":
			int r1 = n1+n2;
			System.out.println(r1);
			break;
		case "sub":
			int r2 = n1-n2;
			System.out.println(r2);
			break;
		case "mul":
			int r3 = n1*n2;
			System.out.println(r3);
			break;
		case "div":
			int r4 = n1/n2;
			System.out.println(r4);
			break;
		default :
			System.out.println("plz enter the correct operator");
			break;
			
		}

	}

}
