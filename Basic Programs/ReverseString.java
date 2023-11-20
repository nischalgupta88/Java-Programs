import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to be reversed: ");
		String s = sc.next();
		
		Reverse(s);
		sc.close();
	}
	
	static void Reverse(String str)
	{
		int i = str.length()-1;
		
		while(i>=0)
		{
			System.out.print(str.charAt(i));
			i--;
		}
		
	}

}
