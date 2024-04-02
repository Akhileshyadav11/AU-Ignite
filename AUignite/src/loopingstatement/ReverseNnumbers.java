package loopingstatement;
import java.util.Scanner;
public class ReverseNnumbers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number from you want to print reverse:");
		int n=sc.nextInt();
		while(n>=1) {
			System.out.println(n);
			n--;
		}
	}

}
