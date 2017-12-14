import java.util.*;

public class QuickSort {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int count=0;count<n;count++)
            ar[count]=sc.nextInt();
        quickSort(ar,0,n-1);
       printArray(ar,n);
       sc.close();

    }
    public static void printArray(int ar[],int n)
    {
        for(int count=0;count<n;count++)
            System.out.println(ar[count]);
    }
    public static void quickSort(int ar[],int left,int right)
    {
        int x;
        if(left<right)
        {
            x=code(ar,left,right);
            quickSort(ar,left,x-1);
            quickSort(ar,x+1,right);
        }
    }
    public static int code(int ar[],int left,int right)
    {
        int pivot=ar[right];
        int start=left-1;
        int temp;
        for(int end=left;end<=right-1;end++)
        {
        	System.out.println(end);
        	System.out.println(ar[end]+"<"+pivot);
            if(ar[end]<=pivot)
            {
                start++;
                temp=ar[start];
                ar[start]=ar[end];
                ar[end]=temp;
            }
         }
         temp=ar[start+1];
            ar[start+1]=ar[right];
            ar[right]=temp;
     return start+1;   
    }
    
}