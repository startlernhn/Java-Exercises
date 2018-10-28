package java1.slide2;

import java.util.Scanner;

//Giai phuong trinh bat nhat voi cac he so a va b nhap tu ban phim
public class Exercise1 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please type factor a ...");
		int a = scanner.nextInt();
		
		System.out.println("Please type factor b ...");
		int b = scanner.nextInt();
		
		if(a==0) {
			System.out.println("Vo Nghiem");
		}else {
				if(b==0) {
					System.out.println("Vo So Nghiem");
				}else {
					float x = -b/a;
					System.out.printf("x = %f", x);
				}
			}
		
	}
}
