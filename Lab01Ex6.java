package assignment;
import java.util.Scanner;

public class Lab1Ex6 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Input your scores of four subjects "
				+ "(Math, English, Physics, and Programming): ");
		
		int a, b, c, d; 
		
		a = inp.nextInt();
		b = inp.nextInt();
		c = inp.nextInt();
		d = inp.nextInt();
		
		int max = Math.max(Math.max(a, b), Math.max(c, d));
		int min = Math.min(Math.min(a, b), Math.min(c, d));
		
		double average = (a + b + c + d) / 4.0;
		String maxCourses = "";
		if (a == max) {
			maxCourses = "Math";
		}
		if (b == max) {
			if (!maxCourses.equals("")) maxCourses += " and "; 
			maxCourses += "English";
		}
		if (c == max) {
			if (!maxCourses.equals("")) maxCourses += " and ";
			maxCourses += "Physics";
		}
		if (d == max) {
			if (!maxCourses.equals("")) maxCourses += " and ";
			maxCourses += "Programming";
		}

		
		
		String minCourses = "";
		if (a == min) {
			minCourses = "Math"; 
		}
		if (b == min) {
			if (!minCourses.equals("")) minCourses += " and ";
			minCourses += "English";
		}
		if (c == min) {
			if (!minCourses.equals("")) minCourses += " and ";
			minCourses += "Physics";
		}
		if (d == min) {
			if (!minCourses.equals("")) minCourses += " and ";
			minCourses += "Programming";
		} 


		System.out.println("Max score is: " + max + " (" + maxCourses + ").");
		System.out.println("Min score is: " + min + " (" + minCourses + ").");
		System.out.printf("Average score of this student is: %.2f%n", average);

		inp.close();
		}
	}
		
