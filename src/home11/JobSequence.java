/*
QUESTION:http://www.geeksforgeeks.org/job-sequencing-problem-set-1-greedy-algorithm/
Job Sequencing Problem | Set 1 (Greedy Algorithm)
2.9
Given an array of jobs where every job has a deadline and associated profit if the job is finished before the deadline. It is also given that every job takes single unit of time, so the minimum possible deadline for any job is 1. How to maximize total profit if only one job can be scheduled at a time.

Examples:

Input: Four Jobs with following deadlines and profits
  JobID    Deadline      Profit
    a        4            20   
    b        1            10
    c        1            40  
    d        1            30
Output: Following is maximum profit sequence of jobs
        c, a   


Input:  Five Jobs with following deadlines and profits
   JobID     Deadline     Profit
     a         2           100
     b         1           19
     c         2           27
     d         1           25
     e         3           15
Output: Following is maximum profit sequence of jobs
        c, a, e
Recommended: Please solve it on “PRACTICE ” first, before moving on to the solution.
A Simple Solution is to generate all subsets of given set of jobs and check individual subset for feasibility of jobs in that subset. Keep track of maximum profit among all feasible subsets. The time complexity of this solution is exponential.

This is a standard Greedy Algorithm problem. Following is algorithm.

1) Sort all jobs in decreasing order of profit.
2) Initialize the result sequence as first job in sorted jobs.
3) Do following for remaining n-1 jobs
.......a) If the current job can fit in the current result sequence 
          without missing the deadline, add current job to the result.
          Else ignore the current job.
*/
package home11;
//		My Code
class Job{
	char job;
	int dead;
	int profit;
	Job(char a,int b,int c)
	{
		job=a;
		dead=b;
		profit=c;
	}
}
public class JobSequence {
	public static void main(String arg[])
	{
		char answer[];
		Job ar[] = new Job[5];
		ar[0]=new Job('a',2,100);
		ar[1]=new Job('b',1,19);
		ar[2]=new Job('c',2,27);
		ar[3]=new Job('d',1,25);
		ar[4]=new Job('e',3,15);
		
		answer=result(ar);
		for(char x:answer)
			if(x!='z')
			System.out.println(x);
	}
	public static char[] result(Job ar[])
	{
		int length=ar.length;
		ar=sort(ar,length);
		char result[]=new char[length];
		for(int count1=0;count1<length;count1++)
			result[count1]='z';
		for(int count=0;count<length;count++)
		{
			if(result[ar[count].dead-1]=='z')
				result[ar[count].dead-1]=ar[count].job;
			else
				for(int index=ar[count].dead-2;index>=0;index--)
					if(result[index]=='z')
						result[index]=ar[count].job;
		}
		return result;
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
		//System.out.print(ar.toString());
		return ar;
	}

}
