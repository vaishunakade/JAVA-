package com.array;
//write a code to array of object for the student , student as id, name,mark.
class Student
{
	int id;
	String name;
	int mark;
	
	public Student(int i,String n,int m)
	{
		this.id=i;
		this.name=n;
		this.mark=m;
	}
	public String toString()
	{
		return id+" "+name+" "+mark;
	}
}
public class Student_array_using_constructor {

	public static void main(String[] args) {
		Student s[]=new Student[3];
		s[0] = new Student(1,"Vaishu",91);
		s[1] = new Student(2,"Amit",62);
		s[2] = new Student(3,"Ridhant",96);
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
	}

}
