package home11;

//Server Code

/*class Job{
	char job;
	int dead;
	int profit;
	Job(char a,int b,int c)
	{
		job=a;
		dead=b;
		profit=c;
	}
}*/
public class JobSequence11 {
	public static void main(String arg[])
	{
		//int answer[];
		Job ar[] = new Job[5];
		ar[1]=new Job('b',1,19);
		ar[2]=new Job('c',2,27);
		ar[3]=new Job('d',1,25);
		ar[4]=new Job('e',3,15);
		ar[0]=new Job('a',2,100);
		printJobScheduling(ar,ar.length);
		//answer.toString();
	}
	static void printJobScheduling(Job ar[], int n)
	{
	    // Sort all jobs according to decreasing order of prfit
	    ar=sort(ar,n);
	 
	    int result[]=new int[n]; // To store result (Sequence of jobs)
	    Boolean slot[]=new Boolean[n];  // To keep track of free time slots
	 
	    // Initialize all slots to be free
	    for (int i=0; i<n; i++)
	        slot[i] = false;
	 
	    // Iterate through all given jobs
	    for (int i=0; i<n; i++)
	    {
	       // Find a free slot for this job (Note that we start
	       // from the last possible slot)
	    	//System.out.println(i);
	       for (int j=Math.min(n, ar[i].dead)-1; j>=0; j--)
	       {
	          // Free slot found
	          if (slot[j]==false)
	          {
	             result[j] = i;  // Add this job to result
	             slot[j] = true; // Make this slot occupied
	             break;
	          }
	       }
	    }
	 
	    // Print the result
	    for (int i=0; i<n; i++)
	       if (slot[i])
	         System.out.println( ar[result[i]].job+" ");
	}
	static Job[] sort(Job ar[],int n)
	{
		int temp3,temp2;
		char temp1;
		for(int i=0;i<n;i++)
			for(int j=1;j<n-i;j++)
			{
				//System.out.println(ar[j-1].profit+" "+ar[j].profit);
				if(ar[j-1].profit<ar[j].profit)
				{
					temp2=ar[j].profit;
					ar[j].profit=ar[j-1].profit;
					ar[j-1].profit=temp2;
					
					temp3=ar[j].dead;
					ar[j].dead=ar[j-1].dead;
					ar[j-1].dead=temp3;
					
					temp1=ar[j].job;
					ar[j].job=ar[j-1].job;
					ar[j-1].job=temp1;
				}
			}
		//for(int z=0;z<n;z++)
			//System.out.println(ar[z].job);
		//System.out.print(ar.toString());
		return ar;
	}

}
