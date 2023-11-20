import java.util.Scanner;
public class PalFun {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:- ");
		String str = sc.next();
		isPalindrome(str);
		sc.close();
	}
	
	static void isPalindrome(String str)
	{
		int i=0, j=0;
		j = str.length()-1;
		
		for(i=0; str.charAt(j) == str.charAt(i); )
		{
			if(i >= j)
			{
				break;
			}
			i++;
			j--;
		}
		
		if(i >= j)
		{
			System.out.println("The given String is a palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}
}
