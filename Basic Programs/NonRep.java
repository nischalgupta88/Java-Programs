import java.util.Scanner;

public class NonRep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:- ");
		String str = sc.next();
		
		int i=0,j=0;
		
		for(i=0; i < str.length(); i++)
		{
			for(j=0; j < str.length(); j++)
			{
				if(i != j)
				{
					if(str.charAt(j) == str.charAt(i))
					{
						break;
					}
				}
			}
			if(j == str.length())
			{
				break;
			}
		}
		
		if(j == str.length())
		{
			System.out.println("The first non- repeating character in the string is:- "+ str.charAt(i));
		}
		else
		{
			System.out.println("The string has no non-repeating character");
		}
		
		sc.close();

	}

}
