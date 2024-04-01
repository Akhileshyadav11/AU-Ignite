package conditionalstatement;
import java.util.Scanner;
public class SpecialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		int d1=n%10;
		int d2=n/10;
		if(n==d1*d2+d1+d2)
		{
			System.out.println("This is special number.");
			
		}
		else
		{
			System.out.println("Not a special number.");
		}
	}

}
