package com.containnment;
/* WAP to have Department class created with id, name . Student class has
roll, name and Department object should have id and name. Assign and
print individual values in main method */
class Department 
{
	int did;
	String dname;
	public void setDid(int id )
	{
		this.did=id;
	}
	public void setDname(String n)
	{
		this.dname=n;
	}
	public int getDid()
	{
		return did;
	}
	public String getDname()
	{
		return dname;
	}
	void show()
	{
		System.out.println(did + " "+ dname);
	}
}
class Student
{
	int roll_no;
	String sname;
	public void setRoll_no(int no)
	{
		this.roll_no = no;
	}
	public void setSname(String name)
	{
		this.sname=name;
	}
	public int getRoll_no()
	{
		return roll_no;
	}
	public String getSname()
	{
		return sname;
	}
	void show1()
	{
		System.out.println(roll_no + " "+ sname);
	}
	}
public class Using_getter_setter_Department {

	public static void main(String[] args) {
		Department d = new Department();
		Student s = new Student();
		d.setDid(1);
		d.setDname("E&TC");
		s.setRoll_no(101);
		s.setSname("Vaishnavi");
		d.show();
		s.show1();
		
	}
}
