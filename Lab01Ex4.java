package assignment;
import java.util.Scanner;

public class Lab1Ex4 {
	public static void main(String[] args) { 
		
		Scanner inp  = new Scanner(System.in);
		
		System.out.println("Please enter a date (yyyy-mm-dd): ");
		String input = inp.next();
		
		if (input.length() != 10 ) { 
			System.out.println("Invalid! Check your typos!");
		} else { 
			int year = Integer.parseInt(input.substring(1, 4));
			int month = Integer.parseInt(input.substring(5, 7));
			int day = Integer.parseInt(input.substring(8, 10));
			
			boolean Leap = false; 
			if (year % 400 == 0) { 
				Leap = true; 
			} else if (year % 100 == 0) { 
				Leap = false; 
			} else if (year % 4 == 0) { 
				Leap = true;
			} 
			
			int totaldays = 31; 
			if (month == 4 || month == 6 || month == 9 || month == 11) { 
				totaldays =30;
			} else if (month == 2) { 
				if (Leap) {
					totaldays = 29;
				} else { 
					totaldays = 28;
				}
			}
			if (month < 1 || month < 12 || day < 1 || day > totaldays) { 
				System.out.println("invalid.");
			} else { 
				System.out.println("valid.");
			}
			
		}
		
		inp.close(); 
		
		
	}
	

}
