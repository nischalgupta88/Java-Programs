import java.util.Scanner;

class Node{
	int data;
	Node next;
		
	public Node(int value)
	{
		this.data = value;
		
	}
};
public class LLDelete {
 
	
	
	public static void main(String[] args) {
		Node head=null;
		Node tail=null;
		Node current;
		
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
		
		//Printing the nodes in the linked list.
		current = head;
		while(current!=null)
		{
			System.out.println(current.data);
			current = current.next;
		}
		
		
		//Searching and Deleting the nodes.
		System.out.println("Enter the node value to be deleted");
		int search = sc.nextInt();
		
		
		Node prev=head;
		current = head;
		while(current != null)
		{
			if(current.data == search)
			{
				break;
			}
			if(current == head)
			{
				current = current.next;
			}	
			else {
				prev = prev.next;
				current = current.next;
			}
				
		}
		
		
		if(current.data == search)
		{
			if(current == head)
				head = head.next;
			else if(current == tail) {
				tail = prev;
				tail.next = null;
			}
			else
				prev.next = current.next;
		}
		else
			System.out.println("The value entered doesn't exist in the list.");
		
		
		current = head;
		
		while(current!=null)
		{
			System.out.println(current.data);
			current= current.next;
		}
		
		
		//Inserting at a specified position in the linked list.
		System.out.println("Enter the value to be inserted in the specified position");
		int insert = sc.nextInt();
		current = head;
		prev = head;
		System.out.print("Enter the value to be inserted in the linked list: ");
		userVal = sc.nextInt();
		Node n = new Node(userVal);
		if(insert ==1 )
		{
			n.next = head;
			head = n;
		}
		
		else
		{
			current = head;
			prev =  head;
			for(int counter = 1; counter < insert; counter++)
			{
				
				if(counter == 1)
				{
					current = current.next;
				}	
				else {
					current = current.next;
					prev = prev.next;
				}
				
			}
			if(prev == tail) {
				tail.next = n;
				tail = n;
				tail.next = null;
			}
			else {
				n.next = current;
				prev.next = n;
			}
		}
		
		
		
		
		
		current = head;
		while(current!=null)
		{
			System.out.println(current.data);
			current= current.next;
		}
		
		
//		System.out.println(n.data);		
//		current = n1;
//		System.out.println(current.data);
//		current = current.next;
//		System.out.println(current.data);
		
		
		sc.close();
	}

}
