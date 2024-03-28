package com.array;

import java.util.Arrays;
import java.util.Scanner;

class Student1
{
	int id;
	String name;
	int marks[];
	public Student1(int i,String n,int marks[])
	{
		this.id=i;
		this.name=n;
		this.marks=marks;
	}
	public String toString()
	{
		return id+" "+name+" "+Arrays.toString(marks);
	}
	public static void showPercentage(Student1 s[])
	{
		for(int i=0;i<s.length;i++)
		{
			
		}
	}
}
public class Student_marks_containtment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Student: ");
		int size1 = sc.nextInt();
		Student1 s[] = new Student1[size1];
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter the id: ");
			int id = sc.nextInt();
			System.out.println("Enter the name: ");
			String n = sc.next();
			
			System.out.println("Enter the size of array: ");
			int size = sc.nextInt();
			int mk[]=new int[size];
			System.out.println("Enter the student marks: ");
			for(int j=0;j<mk.length;j++)
			{
				mk[j]=sc.nextInt();
			}
			s[i]= new Student1(id,n,mk);
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
}
