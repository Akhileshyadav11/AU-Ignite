package conditionalstatement;
import java.util.Scanner;
public class DigitOrNumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number/digit of your choice:");
	int a=sc.nextInt();
    
	if(a<10){
		System.out.println("You have entered a digit");
	}
	else 
	{
		System.out.println("This is a number");
	}	
	}
}
