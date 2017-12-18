package home11;

class Node{
	Node lptr;
	Node rptr;
	int data;
	Node(int d){
		data=d;
		lptr=rptr=null;
	}
}
public class Trees{
	Node root;
	public void insert(int d)
	{
		root=insertRec(root,d);
	}
	Node insertRec(Node root,int d)
	{
		if(root==null)
		{
			Node node=new Node(d);
			root=node;
			return root;
		}
		if(d>root.data)
			root.rptr=insertRec(root.rptr,d);
		else if(d<root.data)
			root.lptr=insertRec(root.lptr,d);
		return root;
	}
	public void delete(int d)
	{
		root=deleteRec(root,d);
	}
	Node deleteRec(Node root,int d)
	{
		if(root==null)
			return root;
		if(d<root.data)
			root.lptr=deleteRec(root.lptr,d);
		else if(d>root.data)
			root.rptr=deleteRec(root.rptr,d);
		
		
		else
		{
			// node with only one child or no child
			if(root.lptr==null)
				return root.rptr;
			else if(root.rptr==null)
				return root.lptr;
				
			//find the inorder successor;
			root.data=minValue(root.rptr);
			
			//delete inorder successor
			root.rptr=deleteRec(root.rptr,root.data);
			
		}
		return root;
	}
	int minValue(Node root)
	{
		int min=root.data;
		while(root.lptr != null)
		{
			min=root.lptr.data;
			root=root.lptr;
		}
		return min;
		
	}
	public void display()
	{
		inorder(root);
	}
	void inorder(Node root)
	{
		if(root!=null)
		{
			inorder(root.lptr);
			System.out.println(root.data);
			inorder(root.rptr);
		}
	}
	public static void main(String ar[])
	{
		Trees tree=new Trees();
		tree.insert(10);
		tree.insert(30);
		tree.insert(40);
		tree.insert(20);
		tree.insert(60);
		tree.insert(88);
		tree.insert(90);
		tree.insert(50);
		tree.insert(70);
		tree.insert(80);
		tree.insert(100);
		
		tree.display();
		tree.delete(80);
		//tree.delete(50);
		tree.display();
	}
	
}