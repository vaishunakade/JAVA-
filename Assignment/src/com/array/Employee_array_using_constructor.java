package com.array;
//write a code to array of object for the employee , employee as id, name,sal.
class Employee
{
	int id;
	String name;
	int sal;
	public Employee(int i,String n,int s)
	{
		this.id=i;
		this.name=n;
		this.sal=s;
	}
	public String toString()
	{
		return id+" "+name+" "+sal;
	}
}
public class Employee_array_using_constructor {

	public static void main(String[] args) {
		Employee emp[]= new Employee[2];
		emp[0] = new Employee(1,"Vaishu",50000);
		emp[1] = new Employee(2,"Amit",60000);
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i]);
		}
		

	}

}
