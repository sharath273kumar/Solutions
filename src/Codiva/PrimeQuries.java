package Codiva;

import java.util.*;

public class PrimeQuries {
	public static void main(String arg[])
	{
		
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		int ar[]=new int[q];
		for(int count=0;count<q;count++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			ar[count]=result(a,b);
			//System.out.println(answer);
		}
		for(int count:ar)
			System.out.println(count);
		
	}
	public static int result(int a,int b)
	{
		int x=0,y=0;
		for(int count=a;count<b;count++)
		{
			if(isPrime(count))
			{
				x=count;
				break;
			}
		}
		for(int count=b;count>a;count--)
		{
			if(isPrime(count))
			{
				y=count;
				break;
			}
		}
		return y-x;
		
	}
	public static Boolean isPrime(int flag)
	{
		int c=0;
		for(int count=2;count<=flag/2;count++)
		{
			if ((flag%count)==0)
				c++;
		}
		if(c==0)
			return true;
		else
			return false;
			
	}
	

}
