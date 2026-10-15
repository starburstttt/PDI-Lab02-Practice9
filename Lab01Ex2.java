package assignment;
import java.util.Scanner;


public class Lab1Ex2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double a, b, c;
		
		System.out.println("Please enter a: ");
		a = input.nextDouble();
		
		System.out.println("Please enter b: ");
		b = input.nextDouble();
		
		System.out.println("Please enter c: ");
		c = input.nextDouble();
		
		double delta = ((b*b) - 4*a*c);
		
		if(delta < 0) {
			System.out.println("The delta is negative, Therefore the roots are complex.");
		} else if (delta == 0){
			double root = -c/b; 
			System.out.println("The root of this equation is: " + root);
		} else { 
			double x1 = ((-b) + Math.sqrt(delta));
			double x2 = ((-b) - Math.sqrt(delta));
			
			System.out.println("Delta is: " + delta);
			System.out.println("The roots of The Quadratic Formula " + a + "x^2 + " + b + "x + " + c + " are:");
			System.out.println("x1 = " + x1 + "\n" + "x2 = " + x2); 
			
		}

		
	}

}
