package conditionalstatement;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    double a = sc.nextDouble();

    System.out.print("Enter the second number: ");
    double b = sc.nextDouble();
    
    System.out.println("Enter operator +,-,*,/");
    char operator=sc.next().charAt(0);
    double result;
    switch(operator)
    {
    case '+':
    	result=a+b;
    	System.out.println(result);break;
    case '-':
    	result=a-b;
    	System.out.println(result);break;
    case '*':
    	result=a*b;
    	System.out.println(result);break;
    case '/':
    	result=a/b;
    	System.out.println(result);break;
    default:System.out.println("invalid input");
    }
	}

}
