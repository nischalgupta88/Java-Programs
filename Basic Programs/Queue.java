import java.util.Scanner;
class Node{
	int data;
	Node next;
		
	public Node(int value)
	{
		this.data = value;
		
	}
};
public class Queue {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Do you want to continue: yes or Yes");
		String input = sc.nextLine();
		int count = 1;
		Node head=null;
		Node tail = null;
		Node current = null;
		
		while(input.equalsIgnoreCase("yes"))
		{
			System.out.println("What do you want to perform");
			System.out.println("MENU");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Exit");
			int choice = sc.nextInt();
			
			
			switch(choice) {
			
			case 1: if(head==null) {
						count = 1;
					}
					int userVal;
					System.out.println("Enter the value to be inserted");
					userVal = sc.nextInt();
					Node n = new Node(userVal);
					if(count == 1) {
						head = n;
						tail = n;
						count++;
					}
					else 
					{
						tail.next = n;
						tail = n;
						count++;
					}
					current = head;
					while(current != null)
					{
						System.out.println(current.data);
						current = current.next;
					}
					break;
					
			case 2: if(head == null) {
						System.out.println("Queue is empty cannot remove anything");
					}
					else {	
						head = head.next;
						current = head;
					}
					while(current!= null) {
						System.out.println(current.data);
						current = current.next;
					}
					break;
					
			default:System.out.println("You choose to exit");
					current = head;
					if(head == null) {
						System.out.println("Queue is empty");
					}else {
						System.out.println("The values in the Queue are:- ");
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
