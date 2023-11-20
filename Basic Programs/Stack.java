import java.util.Scanner; 
class Node{
	int data;
	Node next;
		
	public Node(int value)
	{
		this.data = value;
		
	}
};
public class Stack {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Do you want to continue: yes or Yes");
		String input = sc.nextLine();
		int count = 1;
		Node head=null;
		Node tail = null;
		Node current = null;
		Node prev = null;
		while(input.equalsIgnoreCase("yes"))
		{
			System.out.println("What do you want to perform");
			System.out.println("MENU");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Exit");
			int choice = sc.nextInt();
			
			
			switch(choice) {
			
			case 1: if(head==null) {  // PUSH
						count = 1;
					}
					int userVal;
					System.out.println("Enter the value to be inserted");
					userVal = sc.nextInt();
					Node n = new Node(userVal);
					if(count == 1) {    //if no nodes are there
						head = n;
						tail = n;
						prev = n;
						count++;
					}
					else if(count == 2) {
						tail.next = n;
						tail = n;
						count++;
					}
					else 
					{
						tail.next = n;
						tail = n;
						prev = prev.next;
						count++;
					}
					current = head;
					while(current != null)
					{
						System.out.println(current.data);
						current = current.next;
					}
					break;
					
			case 2: 	// Pop
					System.out.println("prev data is:"+prev.data);
					if(head == null) {	 // empty stack 
						System.out.println("Stack is empty cannot remove anything");
					}
					else {				// only 1 node
						if(head == tail) 	// only 1 node is there.
						{
							head = null;
							tail = null;
							count = count - 1;
						}
						else 				// If more than 1 node is there.
						{
							tail = prev;
							tail.next = null;
							count = count - 1;
							// current = head;
							
							prev = head;
							if( head != tail)  // if more than 1 nodes exist
							{
								while(prev.next != tail) 
								{
									prev = prev.next;
								}
							}
//								if( current == head)
//								{
//									current= current.next;
//								}
//								else
//								{
//									current = current.next;
//									prev = prev.next;
//								}
						}
					}
					current = head;
					while(current!= null) {
						System.out.println(current.data);
						current = current.next;
					}
					break;
					
			default:System.out.println("You choose to exit");
					current = head;
					if(head == null) {
						System.out.println("Stack is empty");
					}else {
						System.out.println("The values in the Stack are:- ");
						while(current != null) {
							System.out.println(current.data);
							current = current.next;
						}
					}
					input = "no";
				}
			
			}
		sc.close();	
					
	}

}
