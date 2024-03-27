package com.array;

public class Count_negative_no {

	public static void main(String[] args) {
		int i = 0, count = 0;
		int[] array = {-20, -15, -4, 11, -8, -13, 22, 16, -11, -99};
		
		while(i < array.length) 
		{
			if(array[i] < 0)
			{
				count++;
			}
			i++;
		}
		System.out.println("The Total Number of Negative Array Element = " + count);
	}

}
