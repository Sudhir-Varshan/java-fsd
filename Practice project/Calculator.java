package Assignment;

import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Enter a first number : ");
			double a=sc.nextDouble();
			System.out.println("Enter a second number : ");
			float b=(float) sc.nextDouble();
			System.out.println("Choose an Operation (+,-,*,/) : ");
			char ch = sc.next().charAt(0);
			
			operation(a,b,ch);
		}
		
	}
	public static double operation(double a,float b,char ch) {
		double ans = 0;
        // addition
        if (ch == '+') {
            ans = a + b;
        }
     // subtraction
        else if (ch == '-') {
            ans = a - b;
        }
     // multiplication
        else if (ch == '*') {
            ans = a * b;
        }
      // Division
        else if (ch == '/') {
            ans = a / b;
        }

        System.out.println("Your answer is : " + ans);
        return ans;
	}

}