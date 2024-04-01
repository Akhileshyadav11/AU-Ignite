package conditionalstatement;
import java.util.Scanner;

public class DaysInMonth {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a valid month:");
    int month=sc.nextInt();
    
    if(month==4||month==6||month==9||month==11)
    {
    	System.out.println("The month has 30 days.");
    	
    }
    else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
    {
    	System.out.println("The month has 31 days.");
    }
    else {
    	System.out.println("This is february month.");
    }
    
    
	}
 
}
