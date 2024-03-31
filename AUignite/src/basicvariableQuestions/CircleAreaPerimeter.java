package basicvariableQuestions;
import java.util.Scanner;
public class CircleAreaPerimeter {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter radious of circle:");
	float rad=sc.nextFloat();
	double area=3.14*rad*rad;
	double circumference=2*3.14*rad;
	System.out.println("Area:"+area);
	System.out.println("Circumfrerence:"+circumference);
	}

}
