package conditionalstatement;
import java.util.Scanner;
public class Month {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a month number:");
    
    int a=sc.nextInt();
    if(a>=1&&a<13)
    {
    	System.out.println("This is a valid month.");
    }
    else {
    	System.out.println("Not a valid month.");
    }
	}

}
