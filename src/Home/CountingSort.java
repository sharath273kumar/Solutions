package Home;

import java.util.*;

public class CountingSort {
	
	public static void printOut(String or[],int n,String ar2[])
	{
		String x;
		for(int index=0;index<n;index++)
		{
			x=ar2[index];
		for(int count=10;count<n;count++)
		{
			
			if(ar2[index]==or[count])
			{
				//System.out.println(ar2[index]+"=="+or[count]+" "+count);
				System.out.print(ar2[index]+" ");
			}
			//else if(Arrays.binarySearch(or, x)!=0)
				//System.out.print("-"+" ");
		}
		}
	}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp,index;
        String stemp;
        int ar1[]=new int[n];
        String original[]=new String[n];
        String ar2[]=new String[n];
        
         for(int count=0;count<n;count++)
        {
            ar1[count]=sc.nextInt();
            ar2[count]=sc.next();
        }
         original=ar2;
        temp=0;
        for(int flag=0;flag<n-1;flag++)
        {
            index=flag;
            for(int iflag=flag+1;iflag<n;iflag++)
            {
                if(ar1[iflag]<ar1[index])
                    index=iflag;
           
            }
            temp=ar1[flag];
            ar1[flag]=ar1[index];
            ar1[index]=temp;
            stemp=ar2[flag];
            ar2[flag]=ar2[index];
            ar2[index]=stemp;
            
                       
        }
        
       
        
        printOut(original,n,ar2);
                sc.close();
    }
}