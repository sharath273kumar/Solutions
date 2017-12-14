package Home;

import java.util.*;

public class Closest {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		
		
		int ar[]=new int[n];
		for(int count=0;count<n;count++)
			ar[count]=sc.nextInt();
		int number=sc.nextInt();
		int ans=result(n,ar,number);
		System.out.println(ans);
		sc.close();
	}
	public static int result(int n,int ar[],int number)
	{
		int u=0,l=0,ud,ld;
		if(number>ar[n-1])
			return ar[n];
		if(number<ar[0])
			return ar[0];
		for(int index=0;index<n;index++)
		{
			if(number>ar[index])
				l=ar[index];
			if(number<ar[index])
				u=ar[index];
		}
			ld=number-l;
			ud=u-number;
			if(ld<ud)
				return l;
			else
				return u;
	}

}
