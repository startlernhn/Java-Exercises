package java1.slide1;

import java.util.Scanner;

//Let write a java program to type last name, first name, GPA from keyboard. Then
//print out the screen with format <<last name and first name>> <<GPA>> score

public class Exercise1 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please type your last name...");
		String firstName = scanner.nextLine();
		
		System.out.println("Please type your first name...");
		String lastName = scanner.nextLine();
		
		System.out.println("Please type your GPA at this semester");
		double GPA = scanner.nextDouble();
		
		System.out.printf("%s %s has GPA: %.3f", firstName, lastName, GPA);
		
	}

}
