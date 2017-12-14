package Star;
import java.util.*;


public class BigSorting {

   /* public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long temp=0;
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        int len=unsorted.length;
        long ar[]=new long[len];
        for(int count=0;count<len;count++)
        {
            ar[count]=Long.parseLong(unsorted[count]);
        }
        for(int count=0;count<len;count++)
        	for(int countt=0;countt<len;countt++) {
        		if(ar[countt]>ar[count+1])
        		{
        			temp=ar[countt];
        			ar[countt]=ar[countt+1];
        			ar[countt+1]=temp;
        		}
        	}
        for(int index=0;index<len;index++)
        	System.out.println(ar[index]);
        in.close();
    }*/
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    String[] unsorted = new String[n];
	    String temp;
	    for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
	        unsorted[unsorted_i] = in.next();
	                }
	    for (int i = 0; i < n; i++) {
	    for (int j = 1; j < (n - i); j++) {

	        if ((unsorted[j - 1]).length() >(unsorted[j]).length()) {
	            temp = unsorted[j - 1];
	            unsorted[j - 1] = unsorted[j];
	            unsorted[j] = temp;
	        }
	        else if((unsorted[j - 1]).length()==unsorted[j].length())
	        {
	           boolean flag=true;
	            for(int k=0;k<unsorted[j - 1].length();k++)
	            {
	                if(unsorted[j - 1].charAt(k)>unsorted[j].charAt(k))
	                    flag=false;
	            }
	            if (flag==false)
	            {
	               temp = unsorted[j - 1];
	            unsorted[j - 1] = unsorted[j];
	            unsorted[j] = temp; 
	            }
	        }

	    }
	}
	    for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
	        System.out.println(unsorted[unsorted_i]);
	                }
	}
}
