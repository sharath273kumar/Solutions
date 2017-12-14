package Home;

import java.util.Stack;
class MStack {
	Stack<Integer> s;
	int minEle;

	MStack()
	{
		s=new Stack<Integer>();
	}
	public int getMin()
	{
		return minEle;
	}
	void push(int x)
	{
		if(s.isEmpty())
		{
			s.push(x);
			minEle=x;
		}
		else {
			if(x>minEle)
				s.push(x);
			else
			{
				s.push(2*x-minEle);
				minEle=x;				
			}
		}
	}
	void pop()
	{
		int t;
		if(s.isEmpty())
			System.out.println("Empty");
		else
		{
			t=s.peek();
			if(t>=minEle)
			{
				s.pop();
				System.out.println("Poped"+t);
			}
			
			else if(t<minEle)
				{
				System.out.println("Poped"+t);
					minEle=2*minEle - t;
					s.pop();
				}
			}
		}
	
	void peek()
	{
		if(s.isEmpty())
			System.out.println("Empty");
		else
		{
			if(s.peek()<minEle)
				System.out.println(minEle);
			else
				System.out.println(s.peek());
		}
	}
	
}

public class MStackgetMin
{
	public static void main(String are[])
	{
		MStack s=new MStack();
		System.out.println("Pusging");
		s.push(3);
		s.push(5);
		System.out.println(s.minEle);
		s.push(2);
		s.push(1);
		System.out.println(s.minEle);
		s.push(-1);
		System.out.println(s.minEle);
		
		System.out.println("poping");
		s.pop();
		System.out.println(s.minEle);
		s.pop();
		System.out.println(s.minEle);
		s.pop();
		System.out.println(s.minEle);
		s.pop();
		System.out.println(s.minEle);
		s.pop();
		System.out.println(s.minEle);
		
	}
}
