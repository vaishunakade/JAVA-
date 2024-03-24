package com.baisc;

import java.util.Scanner;
//write java program for switch expression is of string type

public class Switch_case_8 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the game name");
		 
		String game = sc.next();
		switch(game)
		{
		case "KhoKho":
			System.out.println("KhoKho game");
			break;
		case "Kabbadi":
			System.out.println("Kabbadi game");
			break;
		case "Cricket":
			System.out.println("Cricket game");
			break;
		default:
			System.out.println("Inavalid game");
			
		}
	}

}
