package com.array;

import java.util.Arrays;

public class Index_postion {

	public static void main(String[] args) {
		int[] a = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        
        
        int indexposition = 2;
        int newval  = 10;

        System.out.println("Original Array : ");
        System.out.println(  Arrays.toString(a));     
        
      
        for (int i = a.length - 1; i > indexposition; i--) 
        {
            a[i] = a[i - 1];
        }
        
        a[indexposition] = newval;
        System.out.println("New array : ");
        
        System.out.println( Arrays.toString(a));

	}

}
