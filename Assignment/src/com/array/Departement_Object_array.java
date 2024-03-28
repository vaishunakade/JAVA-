package com.array;

import java.util.Arrays;
import java.util.Scanner;

class Employee12
{
	int eid;
	String ename;
	int sal;
	public Employee12(int i,String n,int s)
	{
		this.eid=i;
		this.ename=n;
		this.sal=s;
	}
	public String toString()
	{
		return eid+" "+ename+" "+sal;
	}
}

class Department
{
	int did;
	String dname;
	Employee12[] empd;
	public Department(int did,String dn,Employee12[] e)
	{
		this.did=did;
		this.dname=dn;
		this.empd=e;
	}
	public String toString()
	{
		return did+" "+dname+" "+Arrays.toString(empd);
	}
}

public class Departement_Object_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		Department d [] = new Department[size];
		System.out.println("Enter the Department information");
		for(int i=0;i<d.length;i++)
		{
			System.out.println("Enter the Department id: ");
			int id = sc.nextInt();
			System.out.println("Enter the Department name: ");
			String dn = sc.next();
			
			Employee12 emp[]=new Employee12[3];
			for(int j=0;j<emp.length;j++)
			{
				System.out.println("Enter the emp id: ");
				int eid = sc.nextInt();
				System.out.println("Enter the emp name: ");
				String en = sc.next();
				System.out.println("Enter the sal: ");
				int sl = sc.nextInt();
				
				emp[j]= new Employee12(eid,en,sl);
				
			}
			d[i]= new Department(id,dn,emp);
			
		}
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
		

	}

}
