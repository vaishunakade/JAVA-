package com.array;

public class Freq_unique 
{
public static void freq(int a[])
{
	for(int i=0;i<a.length;i++)
	{
		int count =1;
		boolean isvisited = false;
		for(int k=i-1;k>=0;k--)
		{
			if(a[i]==a[k])
			{
				isvisited = true;
				break;
			}
		}
		if(isvisited == false)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(a[i]+" "+count);
			}
		}
	}
}


          public static void main(String[] args) {
        	  int	a[] = {2,4,5,2,4,6,7,1};
        	  Freq_unique.freq(a);

}
}
