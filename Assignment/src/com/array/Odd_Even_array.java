package com.array;

public class Odd_Even_array {

	public static void main(String[] args) {
		int a[] = {5,9,2,4,6};
		
		System.out.println("Even Number");
		for(int i = 0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("Odd Number");		
		for(int i = 0; i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}

	}

}
