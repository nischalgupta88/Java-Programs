import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int digit=0,val=0;
		int temp = num;
		
		while(temp != 0)
		{
			digit = temp % 10;
			
			val += (int)Math.pow(digit,3);
			//System.out.println(val);
			temp = temp / 10;
		}

		if(val == num )
		{
			System.out.println("The given number is an armstrong number");
		}
		else
		{
			System.out.println("The given number is not an armstrong number");
		}
		sc.close();
	}
	
	

}
