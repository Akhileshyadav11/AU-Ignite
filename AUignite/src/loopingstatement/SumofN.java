package loopingstatement;
import java.util.Scanner;
public class SumofN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no till you want to add:");
		int n=sc.nextInt();
		int sum=0;
		int i=1;
		while(i<n)
		{
		 sum=sum+i;
			System.out.println(sum);
			i++;
		}

	}

}
