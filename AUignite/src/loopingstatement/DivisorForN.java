package loopingstatement;
import java.util.Scanner;
public class DivisorForN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nProgram to print all divisor of any number.");
		System.out.println("Enter a number:\n");
		int n=sc.nextInt();
		System.out.println("Divisor without method.");
		System.out.println("Here are the all factors of "+n);
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("\nDivisor with method.\n");
       divisor(n);
	}
	public static void divisor(int n) {
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
	}

}
