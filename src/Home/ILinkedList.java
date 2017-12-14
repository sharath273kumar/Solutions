package Home;


//This is STACK logic
public class ILinkedList {
	static Node head,t;
	int length=1;
	class Node{
		Node next;
		int data;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	public static Node reverse(Node head)
	{
		Node current=head;
		Node next=null;
		Node prev=null;
		 while(current != null)
		 {
			 next=current.next;
			 current.next=prev;
			 prev=current;
			 current=next;
		 }
		 return prev;
	}
		public void push(int d)
		{
			Node node=new Node(d);
			node.next=head;
			head=node;
			length++;
		}
		public void insert(int pos,int d)
		{
			Node node=new Node(d);
			if(length<pos)
				System.out.println("List id too small");
			else
			{
				t=head;
				Node temp=t;
				while(pos>0)
				{
					temp=t;
					pos--;
					t=t.next;
				}
				temp.next=node;
				node.next=t;
				length++;
			}
		}
		public void append(int d)
		{
			t=head;
			Node node=new Node(d);
			node.next=null;
			while(t.next !=null)
				t=t.next;
			t.next=node;
			length++;
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
		public void delete(int pos)
		{
			if(head==null)
				System.out.println("List is empty");
			else
			{
				t=head;
				Node temp=t;
				int count=0;
				while (t!=null && count!=pos)
				{
					temp=t;
					t=t.next;
					count++;
				}
				temp.next=t.next;
			}
			length--;
		}
		public int search(int d)
		{
			int count=1;
			t=head;
			while(t!=null)
			{
				if(t.data==d)
					return count;
				else
				{
					t=t.next;
					count++;
				}
			}
			return -1;
		}
	/*	public void swap(int num1,int num2)//throws NullPointerException
		{
				if(num1==num2)
					return;
				Node pre1=null,t1=head;
				while(t1!=null || t1.data!=num1)
				{
					pre1=t1;
					t1=t1.next;
				}
				Node pre2=null,t2=head;
				while(t2.data!=num2 || t2!=null)
				{
					pre2=t2;
					t2=t2.next;
				}
				/*t=t2;
				pre1.next=t2;
				pre2.next=t1;
				t2.next=t1.next;
				t1.next=t.next;
				if(t1==null || t2==null)
					return;
				if(pre1!=null)
					pre1.next=t2;
				else
					head=t2;
				if(pre2!=null)
					pre2.next=t1;
				else
					head=t1;
				
				t=t1.next;
				t1.next=t2.next;
				t2.next=t;
		}
		*/

		public static void main(String[] s)
		{
			ILinkedList ll=new ILinkedList();
			ll.push(1);
			ll.push(10);
			ll.push(0);
			ll.append(2);
			ll.append(4);
			ll.insert(4,3);
			ll.append(5);
			ll.append(6);
			ll.delete(1);
			ll.print();
			System.out.println("\n2 found at "+ll.search(2));
			System.out.println((ll.length-1));
			//ll.swap(2,4);
			ll.print();
			head=ll.reverse(head);
			//System.out.println("reversing");
			ll.print();

		}
}
