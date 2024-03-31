package conditionalstatement;
import java.util.Scanner;
public class SmallestInThree {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 3 numbers:");
    double a=sc.nextDouble();
    double b=sc.nextDouble();
    double c=sc.nextDouble();
    
    if(a<b&&a<c) {
    	System.out.println(a+ "is Smallest");
    }
    else if(b<c) {
    	System.out.println(b +"is smallest");
    }
    else {
    	System.out.println(c +"is small");
    }
	}

}
