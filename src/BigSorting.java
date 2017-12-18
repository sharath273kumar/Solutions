/*
QUESTION:https://www.hackerrank.com/challenges/big-sorting/problem
Consider an array of numeric strings, , where each string is a positive number with anywhere from  to  digits. Sort the array's elements in non-decreasing (i.e., ascending) order of their real-world integer values and print each element of the sorted array on a new line.

Input Format

The first line contains an integer, , denoting the number of strings in . 
Each of the  subsequent lines contains a string of integers describing an element of the array.

Constraints

Each string is guaranteed to represent a positive integer without leading zeros.
The total number of digits across all strings in  is between  and  (inclusive).
Output Format

Print each element of the sorted array on a new line.

Sample Input 0

6
31415926535897932384626433832795
1
3
10
3
5
Sample Output 0

1
3
3
5
10
31415926535897932384626433832795
Explanation 0

The initial array of strings is . When we order each string by the real-world integer value it represents, we get:

We then print each value on a new line, from smallest to largest.
*/
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
