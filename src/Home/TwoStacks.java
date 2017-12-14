package Home;

import java.util.*;
import java.util.ArrayList;

public class TwoStacks {
	static int ar[];
	static int top1,top2,size;
	TwoStacks(int n)
	{
		ar=new int[n];
		size=n;
		top1=-1;
		top2=size/2;
	}
	public static void push1(int n)
	{
		if(top1<(size/2-1))
		{
			top1++;
			ar[top1]=n;
		}
		else
		{
			System.out.println("overflow1");
		}
	}
	public static void push2(int n)
	{
		if(top2<size)
		{
			ar[top2]=n;
			top2++;
		}
		else
			System.out.println("overflow2");
	}
	public static void pop1()
	{
		if(top1!=-1)
			top1--;
		else
			System.out.println("underflow");
	}
	public static void pop2()
	{
		if(top2!=size/2)
			top2--;
		else
			System.out.println("underflow");
	}
	public static void print()
	{
		for(int x=0;x<=top1;x++)
			System.out.print(x+" ");
		for(int y=size/2;y<=top2;y++)
			System.out.print(y+" ");
	} 
	public static void main(String arg[])
	{
		TwoStacks stack=new TwoStacks(4);
		stack.push1(0);
		stack.push2(2);
		stack.push1(1);
		//stack.push1(4);
		//stack.pop1();
		stack.push2(3);
		stack.print();
		
	}

}
