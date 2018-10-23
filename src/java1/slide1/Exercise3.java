package java1.slide1;

import java.util.Scanner;

//Let write a program to type a edge then calculating and printing the capacity 
public class Exercise3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please type a edge...");
		double edge = scanner.nextDouble();
		double capacity = Math.pow(edge, 3);
		System.out.printf("The capacity of this rectangle is %.3f ",capacity);

	}

}
