package loopingstatement;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Program to calculate table vua multiplication.");
     System.out.println("Enter any number to calculate table:");
     int n=sc.nextInt();
     for(int j=2;j<=n;n--) 
     {
      for(int i=1;i<=10;i++)
      {
    	  int res=n*i;
    	  System.out.println(n+"*"+ i+"="+res);
      }
     } 
	}

}
