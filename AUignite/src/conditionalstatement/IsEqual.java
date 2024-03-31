package conditionalstatement;
import java.util.Scanner;
public class IsEqual {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers to compare:");
    float a=sc.nextFloat();
    float b=sc.nextFloat();
    if(a==b) {
    	System.out.println("Both are equal numbers");
    }
    else {
    	System.out.println("Both are different numbers.");
    }
	}

}
