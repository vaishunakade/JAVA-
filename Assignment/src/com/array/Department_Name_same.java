package com.array;

import java.util.Scanner;

//Same as above but print Employees whose dept_name is sam


class DepartmentE
{
	int did;
	String dname;
	public DepartmentE(int did,String dname)
	{
		this.did=did;
		this.dname=dname;
	}
	
	
	public String toString()
	{
		return did+" "+dname;
	}
}

class EmployeeInfo
{
	int eid;
	String ename;
	DepartmentE dept;
	
	public EmployeeInfo(int eid,String ename,DepartmentE dept)
	{
		this.eid=eid;
		this.ename=ename;
		this.dept= dept;
	}
	public String toString()
	{
		return eid+" "+ename+"   DeptInformation "+dept;
	}
	public static void showSameDept(EmployeeInfo emp[])
	{
		int count=0;
		for(int i=0;i<emp.length;i++)
		{
			count=0;
			for(int j=0;j<emp.length;j++)
				
			{
				if(emp[i].dept==emp[j].dept)
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(emp[i]);
			}
		}
	}
}

public class Department_Name_same {

	public static void main(String[] args) {
	
		
		EmployeeInfo emp[]=new EmployeeInfo[3];
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee Details");
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("enter the emp id");
			int eid=sc.nextInt();
			System.out.println("Enter the emp name");
			String ename=sc.next();
			System.out.println("Enter the department id");
			int did=sc.nextInt();
			System.out.println("Enter the department name");
			String dname=sc.next();
			
			
			emp[i]=new EmployeeInfo(eid, ename, new DepartmentE(did, dname));
			
			
		}
		System.out.println("................................................");
		
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i]);
		}
		
		System.out.println("-----------Same Dept-------------");
		
		EmployeeInfo.showSameDept(emp);
		

	}
}


