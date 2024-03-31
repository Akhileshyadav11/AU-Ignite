package basicvariableQuestions;
import java.util.Scanner;
public class SquareAreaPerimeter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Side length of Square:");
		float side=sc.nextFloat();
		float area=side*side;
		float perimeter=4*side;
		System.out.println(area);
		System.out.println(perimeter);
		

	}

}
