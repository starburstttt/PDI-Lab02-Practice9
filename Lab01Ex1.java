package assignment;
import java.util.Scanner;
public class Lab1Ex1 {
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in); 
		int number;
		
		System.out.println("Please enter your number: ");
		number = num.nextInt();
		
		if(number<1 || number>1000) {
			System.out.println("This input will give an invalid answer! Please enter 1-1000!");
		} else {
			int sum = 0;
			double average = 0;
			for (int i = 1000; i >= number; i --) {
				System.out.println(i + " ");
				sum += i;
		} 
			average = (double) sum / (1000 - number + 1);
			System.out.println("The sum is: " + sum);
			System.out.println("The average is: " + average);
		}
		
		
		
		

		
	}

}

