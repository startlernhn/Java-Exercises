package java1.slide1;

import java.util.Scanner;

//Let write a java program to type factors of Ax^2 + Bx + C program. Then calculating and
// printing delta
public class Exercise4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please type factor A...");
		double a = scanner.nextDouble();
		
		System.out.println("Please type factor B...");
		double b = scanner.nextDouble();
		
		System.out.println("Please type factor C...");
		double c = scanner.nextDouble();
		
		double delta = Math.pow(b,2) - 4*a*c;
		System.out.println("Delta is : " + delta);
	}

}
