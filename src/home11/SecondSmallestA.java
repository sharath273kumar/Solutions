package home11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondSmallestA {
	public static void main(String arg[]) throws IOException
	{
		int m1,m2;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int length=Integer.parseInt(br.readLine());
		int ar[]=new int[length];
		for(int count=0;count<length;count++)
			ar[count]=Integer.parseInt(br.readLine());
		
		m1=m2=Integer.MAX_VALUE;
		for(int count=0;count<length;count++)
		{
			if(ar[count]<m1)
			{
				m2=m1;
				m1=ar[count];
			}
			else if(ar[count]>m1 && ar[count]<m2)
				m2=ar[count];
		}
		System.out.println(m2);
	}

}
