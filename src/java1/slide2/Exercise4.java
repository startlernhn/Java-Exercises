package java1.slide2;

import java.util.Scanner;

//Viet phuong trinh chua 1 menu gom 3 chuc nang de goi Exercise1, Exercise2, Exercise3
//va 1 chuc nang de thoat khoi ung dung
public class Exercise4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vui long nhap chuc nang...");
		int i = scanner.nextInt();
		switch (i) {
		case 1:
			System.out.println("Please type factor a ...");
			int a = scanner.nextInt();
			System.out.println("Please type factor b ...");
			int b = scanner.nextInt();
			giaiPTB1(a,b);
			break;
		case 2:
			giaiPTB2();
			break;
		case 3:
			tinhTienDien();
			break;
		default:
			break;
		}

	}

	public static void giaiPTB1(int a, int b) {
		if (a == 0) {
			System.out.println("Vo Nghiem");
		} else {
			if (b == 0) {
				System.out.println("Vo So Nghiem");
			} else {
				float x = -b / a;
				System.out.printf("x = %f", x);
			}
		}
	}

	public static void giaiPTB2() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Vui long nhap he so a...");
		float a = scanner.nextFloat();
		System.out.println("Vui long nhap he so b...");
		float b = scanner.nextFloat();
		System.out.println("Vui long nhap he so c...");
		float c = scanner.nextFloat();

		if (a == 0) {
			float x = -c / b;
		} else {
			double delta = Math.pow(b, 2) - 4 * a * c;
			// float delta = (float) (Math.pow(b, 2)-4*a*c);
			if (delta < 0) {
				System.out.println("Vo Nghiem");
			} else {
				if (delta == 0) {
					float x = -b / (2 * a);
					System.out.println("Nghiem Kep : " + x);
				} else {
					double x1 = (-b + Math.sqrt(delta)) / (2 * a);
					double x2 = (-b - Math.sqrt(delta)) / (2 * a);

					System.out.printf("2 Nghiem Phan Biet x1 = %.3f va x2 = %.3f", x1, x2);
				}
			}

		}
	}

	public static void tinhTienDien() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Vui long nhap so dien cua thang...");
		int soDien = scanner.nextInt();
		if (soDien > 0 && soDien <= 50) {
			int giaDien = soDien * 1000;
			System.out.println("Gia dien cua thang : " + giaDien);
		} else {
			int giaDien = 50 * 1000 + (soDien - 50) * 1200;
			System.out.println("Gia dien cua thang : " + giaDien);
		}
	}

}
