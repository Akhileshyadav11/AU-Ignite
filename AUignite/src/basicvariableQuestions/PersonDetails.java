package basicvariableQuestions;
import java.util.Scanner;
public class PersonDetails {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Name,Mobile,10th,12th and Graduation percentage");
    String name=sc.nextLine();
    long mobile=sc.nextLong();
    float percent10=sc.nextFloat();
    float percent12=sc.nextFloat();
    float percentDegree=sc.nextFloat();
    
    System.out.println("Name:"+name);
    System.out.println("Mobile"+mobile);
    System.out.println("10th:"+percent10);
    System.out.println("12th:"+percent12);
    System.out.println("Degree:"+percentDegree);
	}

}
