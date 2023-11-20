import java.util.Scanner;
public class ReverseFunction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to reverse");
		int num = sc.nextInt();
		System.out.println(Reverse(num));
		sc.close();
	}
	
	static int Reverse(int num)
	{
		int reversed=0, digit =0;
		
		while(num != 0)
		{
			digit = num % 10;
			reversed = reversed * 10 +digit;
			num = num /10;
		}
		return reversed;
	}

}
