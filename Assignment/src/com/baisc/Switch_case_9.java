package com.baisc;

import java.util.Scanner;

/*
 WAP in java using switch case for following: Area of a circle Area of a square Area of a 
 right angled triangle Area of a rectangle Circumference of a circle Perimeter of a square 
 Accept inputs like radius,side,etc through keyboard.
 */
public class Switch_case_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the (circle, square, rectangle, right_triangle, triangle,)");
		String operation = sc.next();
		switch(operation)
		{
		case "circle":
			
			System.out.println("Enter radius :");
			float r = sc.nextFloat();
			float area = 3.14f * r * r;
			System.out.println("Area of circle: "+area);
			break;
			
		case "square":	
			
			System.out.println("Enter side :");
			float s = sc.nextFloat();
			float area1 =  s * s;
			System.out.println("Area of square: "+area1);
			break;
			
			
		case "right_triangle":
			
			System.out.println("Enter a :");
			float a = sc.nextFloat();
			System.out.println("Enter b :");
			float b = sc.nextFloat();
			float area2 = (a*b)/2;
			System.out.println("Area of right_triangle "+area2);
			break;
			
		case "triangle":
			
			System.out.println("Enter h :");
			float h = sc.nextFloat();
			System.out.println("Enter b :");
			float b1 = sc.nextFloat();
			float area3 = (h*b1)/2;
			System.out.println("Area of triangle "+area3);
			break;
			
		case "rectangle" :
			
			System.out.println("Enter l :");
			float l = sc.nextFloat();
			System.out.println("Enter w :");
			float w = sc.nextFloat();
			float area4 = l*w;
			System.out.println("Area of rectangle "+area4);
			break;
			
		}
	}
}
