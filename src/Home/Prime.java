package Home;

import java.util.*;
public class Prime {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(isPrime(a))
			System.out.println("true");
		else
			System.out.println("false");
	}
	public static Boolean isPrime(int flag)
	{
		int c=0;
		for(int count=1;count<=flag;count++)
		{
			if ((flag%count)==0)
				c++;
		}
		if(c==2)
			return true;
		else
			return false;
			
	}

}
