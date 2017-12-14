package Home;

public class MergeLL {
	Node head,t;
	static MergeLL l1=new MergeLL(),l2=new MergeLL(),l3=new MergeLL(),l4=new MergeLL();
	class Node{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public void push(int data)
	{
		Node node=new Node(data);
		node.next=head;
		head=node;
	}
	public void print()
	{
		t=head;
		while(t !=null)
		{
			System.out.print(t.data+" ");
			t=t.next;
		}
	}
	public static void main(String str[])
	{
		
		l1.push(1);
		l1.push(3);
		l1.push(5);
		l1.push(7);
		
		l2.push(2);
		l2.push(4);
		l2.push(6);
		l2.push(8);
		
		l3.push(0);
		l3.push(9);
		l3.push(10);
		l3.push(11);
		
		l4=sort(l1,l2,l3);
		l4.print();
		
	}
	public static MergeLL sort(MergeLL l1,MergeLL l2,MergeLL l3)
	{
		int count=0;
		while(l1.head.next !=null || l2.head.next != null || l3.head.next != null)
		{
			count++;
		int a,b,c;
		
		a=l1.head.data;
		b=l2.head.data;
		c=l3.head.data;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		if(a<b)
		{
			if(a<c)
			{
				l4.push(a);
				l1.head=l1.head.next;
				System.out.println(a);
			}
		}
		else if(b<a)
		{
			if(b<c)
			{
				l4.push(b);
				l2.head=l2.head.next;
				System.out.println(b);
			}
		}
		else if(c<a)
		{
			if(c<b)
			{
				l4.push(c);
				l3.head=l3.head.next;
				System.out.println(c);
			}
		}
		}
		System.out.println("count="+count);
		return l4;
		
	}
	

}
