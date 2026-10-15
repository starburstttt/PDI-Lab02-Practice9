package assignment;
import java.util.Scanner;


public class Lab1Ex3 {
	public static void main(String[] args) { 
		Scanner inp = new Scanner(System.in); 
		
		int a, b, c, d, e;
		
		System.out.println("Please enter 5 numbers: ");
		a = inp.nextInt(); 
		b = inp.nextInt();
		c = inp.nextInt();
		d = inp.nextInt();
		e = inp.nextInt();
		
		int min = Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
		int max = Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));
		
		
		System.out.println("Among all the five input numbers (" + a + ", " + b + ", " + c + ", "
		+ d + ", " + e + "), min is " + min + " and max is " + max + ".");
		
		inp.close();
		
	
	}
	

}
