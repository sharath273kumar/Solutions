package Home;

public class LL012 extends ILinkedList{
	public static void main(String ar[])
	{
		ILinkedList ll=new ILinkedList();
		
	}
	public void sort(ILinkedList ll)
	{
		Node pre1=null;
		Node n1;
		Node pre2;
		Node n2;
		int count=0;
		Node temp=ll.head;
		for(int index=0;index<9;index++)
		{
			if(pre1==null)
			{
				if(temp.data!=0)
				{
					while(temp.data==1)
					{
						pre2=temp;
						temp=temp.next;
					}
					n2=temp.next;
				}
				
			}
			
		}
		
	}

}
