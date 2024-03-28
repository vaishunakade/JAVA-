package com.array;
import java.util.Scanner;
/*
 Create class Dept(did, dname), class MyDate(day, month, year)
 Class Employee(emp_id, emp_name, salary, date(object), dept(object)).
 Create array of Employee and display the array elements.
 */

class Dept
{
	int did;
	String dname;
	public Dept(int i,String n)
	{
		this.did=i;
		this.dname=n;
	}
	public String toString()
	{
		return did+" "+dname;
	}
}
class MyDate
{
	int day;
	String month;
	int year;
	public  MyDate(int day,String m,int y)
	{
		this.day=day;
		this.month=m;
		this.year=y;
	}
	public String toString()
	{
		return day+" "+month+" "+year;
	}
}
class Emp1
{
	int eid;
	String name;
	MyDate date;
	Dept dept;
	public Emp1(int i,String n,MyDate d,Dept t)
	{
		this.eid=i;
		this.name=n;
		this.date=d;
		this.dept=t;
	}
	public String toString()
	{
		return eid+" "+name+" "+date+" "+dept;
	}
	
	
}
public class Emp_array {

	public static void main(String[] args) {
		Emp1 e[]= new Emp1[2];
		Scanner sc = new Scanner(System.in);
		System.out.println("--------Enter the Employee daitails---------");
		for(int i=0;i<e.length;i++)
		{
			System.out.println("Enter the emp id: ");
			int eid = sc.nextInt();
			System.out.println("Enter the emp name: ");
			String ename = sc.next();
			System.out.println("--------Enter the date information: --------");
			System.out.println("Enter the day:");
			int d = sc.nextInt();
			System.out.println("Enter the month: ");
			String m = sc.next();
			System.out.println("Enter the year: ");
			int y = sc.nextInt();
			System.out.println("----------Enter the department information: ----------- ");
			System.out.println("Enter the dept id: ");
			int did = sc.nextInt();
			System.out.println("Enter the dept name: ");
			String dn = sc.next();
			
			e[i]=new Emp1(eid, ename, new MyDate(d, m, y), new Dept(did, dn));
			
		}
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i]);
		}
		

	}

}
