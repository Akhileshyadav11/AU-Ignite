package conditionalstatement;
import java.util.Scanner;
public class PositiveNegative {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any integer value:");
    int a=sc.nextInt();
    if(a>0)
    {
    	System.out.println(a+" is positive number.");
    }
    else if (a<0)
    {
    	System.out.println(a+" is negative number.");
    }
    else
    	System.out.println("This is Zero.");
    
	}

}
