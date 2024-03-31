package conditionalstatement;
import java.util.Scanner;
public class MiddleNum {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three numbers of your choice:");
    float a=sc.nextFloat();
    float b=sc.nextFloat();
    float c=sc.nextFloat();
    
    if(a>b&&a<c)
    {
    	System.out.println(a+" is middle value");
    }
    else if(b>a&&b<c)
    {
    	System.out.println(b+" is middle");
    }
    else if(c>a&&c<b)
    {
    	System.out.println(c+" is middle");
    }
	}
}
