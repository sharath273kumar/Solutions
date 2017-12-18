package home11;
//import java.io.*;
//import java.util.Date;
public class Days {
	static int months[]= {31,28,31,30,31,30,31,31,30,31,30,31};

	static class date{
		int day,month,year;
		date(int d,int m,int y)
		{
			day=d;
			month=m;
			year=y;
		}
	}
	public static int countLeaps(date d1)
	{
		int y=d1.year;
		if(d1.month<=2)
			y--;
		return y/4 - y/100 + y/400;
	}
	public static int findDays(date d1,date d2)
	{
		int n1=d1.year*365+d1.day;
		n1+=countLeaps(d1);
		for(int count=0;count<d1.month-1;count++)
			n1+=months[count]; 
		int n2=d2.year*365+d2.day;
		n2+=countLeaps(d2);
		for(int count=0;count<d2.month-1;count++)
			n2+=months[count];
		
		return n2-n1;
	}
	public static void main(String args[])
	{
		date d1=new date(27,3,1998);
		date d2=new date(16,12,2017);
		
		System.out.println(findDays(d1,d2));
		
	}
}
