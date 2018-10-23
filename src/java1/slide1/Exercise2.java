package java1.slide1;

import java.util.Scanner;

//Let write a java program to type 2 edges of rectangle. Then calculating and printing the perimeter, area 
//and smaller edge of this rectangle

public class Exercise2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please type the length...");
		double edge1 = scanner.nextDouble();

		System.out.println("Please type the width...");
		double edge2 = scanner.nextDouble();

		double perimeter = (edge1 + edge2) * 2;
		double area = edge1 * edge2;

		System.out.println("The perimeter : " + perimeter);
		System.out.println("The area : " + area);
		System.out.println("The smaller edge : " + Math.min(edge1, edge2));
	}

}
