package com.array;

import java.util.Arrays;
import java.util.Scanner;

class Product
{
	int pid;
	String name;
	int price;
	public Product(int i,String n,int p)
	{
		this.pid=i;
		this.name=n;
		this.price=p;
	}
	public String toString()
	{
		return pid+" "+name+" "+price;
	}
}

class Order
{
	int id;
	String city;
	Product pdt[];
	public Order(int id,String c,Product pdt[])
	{
		this.id=id;
		this.city=c;
		this.pdt=pdt;
	}
	public String toString()
	{
		return id+" "+city+" "+Arrays.toString(pdt);
	}
	
}
public class Product_order {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		Order o[]=new Order[size];
		System.out.println("Enter the order information: ");
		for(int i=0;i<o.length;i++)
		{
			System.out.println("Enter the order id: ");
			int oid = sc.nextInt();
			System.out.println("Enter the city name: ");
			String city = sc.next();
			
			System.out.println("Enter the size of product: ");
			int size1 = sc.nextInt();
			Product p[]= new Product[size1];
			for(int j=0;j<p.length;j++)
			{
				System.out.println("Enter the product id: ");
				int pid = sc.nextInt();
				System.out.println("Enter the Product name: ");
				String pn = sc.next();
				System.out.println("Enter the Product price: ");
				int pp = sc.nextInt();
				
				p[j]=new Product(pid,pn,pp);
			}
			o[i]=new Order(oid,city,p);
			
		}
		for(int i=0;i<o.length;i++)
		{
			System.out.println(o[i]);
		}

	}

}
