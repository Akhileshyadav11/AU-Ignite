package basicvariableQuestions;
import java.util.Scanner;
public class RectangeAreaPerimeter {

	public static void main(String[] args) {
	System.out.println("Enter the length and breath of rectangle:");
	Scanner sc=new Scanner(System.in);
	float length=sc.nextFloat();
	float breath=sc.nextFloat();
	
	float area=length*breath;
	float perimeter=2*(length+breath);
	System.out.println(area);
	System.out.println(perimeter);
	}

}
