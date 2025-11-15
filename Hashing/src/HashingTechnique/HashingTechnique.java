package HashingTechnique;

public class HashingTechnique {
	Node head[];
	class Node{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public HashingTechnique()
	{
		head=new Node[10];
		for(int i=0;i<head.length;i++)
		{
			head[i]=null;
		}
	}
	
	 public HashingTechnique(int size)
	 {
		 head=new Node[size];
		 for(int i=0;i<head.length;i++)
		 {
			 head[i]=null;
		 }
	 }
	 
	 public void insertData(int val)
	 {
		 Node newNode=new Node(val);
		 int pos=val%head.length;
		 if(head[pos]!=null)
		 {
			 newNode.next=head[pos];
		 }
		 head[pos]=newNode;
	 }

	 public void displayData()
	 {
		 
		for(int i=0;i<head.length;i++)
		{
			Node temp=head[i];
			System.out.println(i+"--------");
			while(temp!=null)
			{
				System.out.println(temp.data+"---");
				temp=temp.next;
			}
			System.out.println("null");
		}
	 }
		 
		public boolean searchData(int val)
		{
			int pos=val%head.length;
			Node temp=head[pos];
			while(temp!=null)
			{
				if(temp.data==val)
				{
					System.out.println(val+"-----"+pos);
					return true;
				}
				temp=temp.next;
			}
			System.out.println(val+"not found"+pos);
			return false;
		}
		 
		 
		 
		 
		 
	 }

