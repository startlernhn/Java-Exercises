package java1.slide2;

import java.util.Scanner;

//Viet phuong trinh giai phuong trinh bac hai trong do cac he so a, b, c nhap tu ban phim

public class Exercise2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Vui long nhap he so a...");
		float a = scanner.nextFloat();
		System.out.println("Vui long nhap he so b...");
		float b = scanner.nextFloat();
		System.out.println("Vui long nhap he so c...");
		float c = scanner.nextFloat();
		
		if(a==0) {
			float x = -c/b;
		}else {
			double delta = Math.pow(b, 2)-4*a*c;
			//float delta = (float) (Math.pow(b, 2)-4*a*c);
			if(delta < 0) {
				System.out.println("Vo Nghiem");
			}else {
				if(delta == 0) {
					float x = -b/(2*a);
					System.out.println("Nghiem Kep : " + x);
				}else {
					double x1 = (-b + Math.sqrt(delta))/(2*a);
					double x2 = (-b - Math.sqrt(delta))/(2*a);
					
					System.out.printf("2 Nghiem Phan Biet x1 = %.3f va x2 = %.3f", x1, x2);
				}
			}
		
		}
		
	}

}
