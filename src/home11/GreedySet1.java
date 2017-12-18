package home11;

public class GreedySet1 {
	public static void main(String args[])
	{
		int start[]= {1,3,0,5,8,5};
		int finish[]= {2,4,6,7,9,9};
		
		findAct(start,finish);
	}
	public static void findAct(int start[],int finish[])
	
	{
		int length=start.length,pre_finish=finish[0];
		System.out.println(start[0]+" "+finish[0]);
		for(int index=0;index<length-1;index++)
		{
			if(pre_finish<=start[index+1])
			{
				System.out.println(start[index+1]+" "+finish[index+1]);
				pre_finish=finish[index+1];
			}
		}
	}

}
