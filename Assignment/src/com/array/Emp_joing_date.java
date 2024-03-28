package com.array;
/*
 WAP to print the employees from Employee[] array who has same joining date. 
  You have Employee class which has 4 attributes id, name, salary,
   date (date is another object which has 3 attributes day, month, year) and 
   add employee objects to your array
 */
class Date
{
	int day;
	int month;
	int year;
	public Date(int d,int m,int y)
	{
		this.day=d;
		this.month=m;
		this.year=y;
	}
	public String toString()
	{
		return day+" "+month+" "+year;
	}
}
class Emp
{   
	
	int id;
	String name;
	int sal;
	Date date;

	public Emp(int i,String n,int s, Date d)
	{
		this.id=i;
		this.name=n;
		this.sal=s;
		this.date=d;
	}
	public Emp(int i, String n, Date date2, Dept dept) 
	{
		
	}
	public String toString()
	{
		return id+" "+name+" "+sal+"     Date:"+date;
	}
	public static  void showDate(Emp e[])
	{int count =0;
		for(int i=0;i<e.length;i++)
		{
			for(int j=i+1;j<e.length;j++)
			{
				if(e[i].date ==e[j].date) //&& (e[i].month == e[j].month) && (e[i].year == e[j].year))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(e[i]);
			}
			
		}
	}
	
}
public class Emp_joing_date {

	public static void main(String[] args) {
		Emp e[] = new Emp[4];
		e[0] = new Emp(1,"Sai",65000,new Date(1,2,2024));
		e[1] = new Emp(2,"Ram",52000,new Date(1,2,2024));
		e[2] = new Emp(3,"Jay",98600,new Date(25,6,2023));
		e[3] = new Emp(4,"Raj",64300,new Date(3,5,2022));
		
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i]);
		}
		
		System.out.println("______________Same Joning Dates_____________");
		Emp.showDate(e);
		
	

	}

}
