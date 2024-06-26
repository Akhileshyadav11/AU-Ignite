package loopingstatement;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to calculate factorial:");
        int n = sc.nextInt();

        long fact = factorial(n);
        System.out.println("The factorial of " + n + " is " + fact);
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
