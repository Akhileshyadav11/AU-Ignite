package numbersprogram;
import java.util.Scanner;

public class Perfect {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Program to calculate Perfect number.");
		System.out.println("Enter number to check number is perfect or not:");
		
	    int n=sc.nextInt();
	    int sum=0;
	    for(int i=1;i<n;i++)
	    {
	    	if(n%i==0)
	    	{
	    	    sum=sum+i;
	    	}
	    }
	    if(sum==n) {
    		System.out.println("Perfect number");
    	}
	}

}
