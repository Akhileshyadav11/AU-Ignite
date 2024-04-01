package conditionalstatement;
import java.util.Scanner;
public class ValidDate {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Year:");
   int year=sc.nextInt();
   System.out.println("Enter a month:");
   int month=sc.nextInt();
   System.out.println("Enter a date:");
   int date=sc.nextInt();
   if(date>=1&&date<=31) {
   if(month==4||month==6||month==9||month==11)
   {
   	System.out.println("The month has 30 days.");
   	
   }
   else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
   {
   	System.out.println("The month has 31 days.");
   }
   else if(year%4==0&&year%100!=0||year%400==0)
   {
   	System.out.println("This is leap year.");
   	System.out.println("This month has 29 days.");
   }
   else
   {
	   System.out.println("invalid date.");
   }
   }
   }
}
