package java1.slide2;

import java.util.Scanner;

//Viet phuong trinh nhap vao so dien su dung cua thang va tinh tien dien theo 
//phuong phap tich luy:
//Neu so dien tu 0 den 50 thi gia moi so dien la 1000
//Neu so dien tren 50 thi gia moi so dien vuot muc la 1200
public class Exercise3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vui long nhap so dien cua thang...");
		int soDien = scanner.nextInt();
		if(soDien>0 && soDien<=50) {
			int giaDien = soDien*1000;
			System.out.println("Gia dien cua thang : "+ giaDien);
		}else {
			int giaDien = 50*1000 + (soDien-50)*1200;
			System.out.println("Gia dien cua thang : "+ giaDien);
		}
	}
}
