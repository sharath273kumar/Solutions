import java.util.*;
public class InsertionSort {
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int key,flag;
		for(int count:arr)
		{
			arr[count]=sc.nextInt();
			System.out.println(arr[count]);
		}
		/*for( int index=1;index<size;index++)
		{
			key=array[index];
			flag=index-1;
		while(flag>=0 && array[flag]>key)
		{
			
			array[flag+1]=array[flag];
			flag--;
		}
		array[flag+1]=key;
		}*/
		
	    for (int i=1; i<n; ++i)
	    {
	         key = arr[i];
	        int j = i-1;

	        /* Move elements of arr[0..i-1], that are
	           greater than key, to one position ahead
	           of their current position */
	        while (j>=0 && arr[j] > key)
	        {
	            arr[j+1] = arr[j];
	            j = j-1;
	        }
	        arr[j+1] = key;
	    }
		//System.out.println(Arrays.toString(array));
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
			
			sc.close();
	}
	

}
