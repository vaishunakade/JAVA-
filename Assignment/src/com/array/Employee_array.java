package com.array;
//1.WAP to print the employees from Employee[] array who has same salary 
//(Create Employee class which has 3 attributes id, name, salary and add employee objects to your array)

class Employee1 
{
	int id;
	String name;
	int sal;
	public Employee1(int i,String n,int s)
	{
		this.id=i;
		this.name=n;
		this.sal=s;
	}
	public String toString()
	{
		return id+" "+name+" "+sal;
	}
	public static  void showSalary(Employee1 emp[])
	{
		int count=0;
		for(int i=0;i<emp.length;i++)
		{
			count=0;
			for(int j=0;j<emp.length;j++)
				
			{
				if(emp[i].sal==emp[j].sal)
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
public class Employee_array {

	public static void main(String[] args) {
		Employee1[] emp = new Employee1[5];
		emp[0]= new Employee1(1,"Ram",52000);
		emp[1]= new Employee1(2,"Jay",35200);
		emp[2]= new Employee1(3,"Rani",52000);
		emp[3]= new Employee1(4,"Ridhu",60500);
		emp[4]= new Employee1(5,"Riya",60500);
		
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i]);
		}
		
		System.out.println("__________________same salary_____________________");
		Employee1.showSalary(emp);
		
		

	}

}
