package com.baisc;
// check the no is even or odd using switch case
import java.util.Scanner;

public class Switch_case_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		
	    switch(n%2)
	    {
	    case 0:
	    	System.out.println(n+" Number is even ");
	    	break;
	    default:
	    	System.out.println(n+" Number is odd ");
	    	break;
	    }
	}

}
