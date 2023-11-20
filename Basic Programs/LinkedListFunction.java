import java.util.Scanner;

class Node{
	int data;
	Node next;
		
	public Node(int value)
	{
		this.data = value;
		
	}
};
public class LLFunc {
	Scanner sc = new Scanner(System.in);
	Node current1,prev1;
	
	public void display(Node head) {
		 current1 = head;
		 while(current1!=null) {
			 System.out.println(current1.data);
			 current1= current1.next;
		 }
		 
		 
	 }
	public Node search(Node head) {
		 System.out.println("Enter the node value to be deleted");
		 int search = sc.nextInt();
		 prev1=head;
		 current1 = head;
			while(current1 != null)
			{
				if(current1.data == search)
				{
					return current1;
				}
				if(current1 == head)
				{
					current1 = current1.next;
				}	
				else {
					prev1 = prev1.next;
					current1 = current1.next;
				}
					
			}
			return null;
	 }
	public Node delete(Node cat1,Node head, Node tail) {
		if(cat1 == null) {
			System.out.println("Not Found");
			
		}
		else
		{
			if(cat1 == head) {
				head = head.next;
				return head;
			}
			else if(cat1 == tail) {
				tail = prev1;
				tail.next = null;
				return head;
				
			}
			else {
				prev1.next = cat1.next;
				return head;
			}
		}
		return head;
	}
	
	public void add(Node head,Node tail) {
		System.out.println("Enter the value to be inserted in the specified position");
		int insert = sc.nextInt();
		current1 = head;
		prev1 = head;
		System.out.print("Enter the value to be inserted in the linked list: ");
		int userVal = sc.nextInt();
		Node n = new Node(userVal);
		if(insert ==1 )
		{
			n.next = head;
			head = n;
		}
		
		else
		{
			current1 = head;
			prev1 =  head;
			for(int counter = 1; counter < insert; counter++)
			{
				
				if(counter == 1)
				{
					current1 = current1.next;
				}	
				else {
					current1 = current1.next;
					prev1 = prev1.next;
				}
				
			}
			if(prev1 == tail) {
				tail.next = n;
				tail = n;
				tail.next = null;
			}
			else {
				n.next = current1;
				prev1.next = n;
			}
		}
	}
	public static void main(String[] args) {
		Node head=null;
		Node tail=null;
		Node current=null;
		
		Scanner sc = new Scanner(System.in);
	
		int userVal;
		System.out.println("Enter the number of nodes");
		int total = sc.nextInt();
		
		//Creating nodes in a linked list.
		for(int counter = 1; counter <= total; counter++) {
			System.out.println("Enter the value");
			userVal = sc.nextInt();
			Node n = new Node(userVal);
			if(counter == 1)
			{
				head = n;
				tail = n;
			}
			else 
			{
				tail.next = n;
				tail = n;
			}
		}
		LLFunc l = new LLFunc();
		l.display(head);
		
		Node cat= l.search(head);
		Node head1 = l.delete(cat,head,tail);
		l.display(head1);
		l.add(head,tail);
		l.display(head);
		sc.close();
	}

}
