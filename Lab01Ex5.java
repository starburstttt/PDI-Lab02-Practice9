package assignment;
import java.util.Scanner;

public class Lab1Ex5 {
	public static void main(String[] args) { 
		Scanner inp = new Scanner(System.in);
		
		
		System.out.println("Please input a number: ");
		int num = inp.nextInt();
		
		if (num < 2) {
			System.out.println("invalid input, please input a number greater than 5!");
		} else { 
			System.out.print("All prime numbers from 2 to " + num + ":");
			
			for(int k = 2; k <= num; k++) { 
				boolean Prime = true;
				
				for(int d = 2; d * d <= k; d++) {
					if ( k % d ==0) {
						Prime = false;
						break;
					}
				}
				if(Prime) {
					System.out.println(" "+ k);
					
				}
				}
			inp.close();
		}
	}
}
