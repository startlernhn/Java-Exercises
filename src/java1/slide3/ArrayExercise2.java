package java1.slide3;

import java.util.Arrays;
import java.util.Scanner;

//NOT COMPLETED YET

//Yeu cau chi duoc phep nhap mang so nguyen. Sau do:
// + Tinh va xuat trung binh cong
// + Xuat ra lap phuong cac phan tu

public class ArrayExercise2 {
	public static void main(String[] args) {
		int[] intArr = nhapMangSoNguyen();
		System.out.println("Mang so nguyen vua nhap : " + Arrays.toString(intArr));
		
		double TB = trungBinhCong(intArr);
		System.out.println("Trung binh cong cua mang : " + TB);
		
		int[] pow3Arr = xuatLapPhuong(intArr);
		System.out.println("Mang voi lap phuong cac phan tu : " + Arrays.toString(pow3Arr));

	}

//	private static int[] nhapMangSoNguyen() {   //Cannot loop to check int factor if incorrectly typing
//		int count;
//		Scanner scanner = new Scanner(System.in);
//		do {
//			System.out.println("Vui long nhap so phan tu cua mang...");
//			count = scanner.nextInt();
//		} while (count < 0);
//
//		int[] arr = new int[count];
//		boolean checkFlag = false;
//		for (int i = 0; i < arr.length; i++) {
//			System.out.printf("Vui long nhap phan tu mang a[%d] : ", i);
//			while(checkFlag = false) {
//				try {
//					arr[i] = scanner.nextInt();
//					System.out.printf("Ban da nhap dung phan tu a[%d] \n", i);
//					checkFlag = true;
//				} catch (Exception e) {
//					System.out.printf("Sai roi! Vui long nhap lai so nguyen cho phan tu a[%d] \n", i);
//					checkFlag = false;
//					continue;
//				}
//			}
//		}
//
//		return arr;
//	}
	
	private static int[] nhapMangSoNguyen() {
		int count;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Nhap so phan tu cua mang...");
			count = scanner.nextInt();
		}while(count<0);
		
		int[] arr = new int[count];
		for (int i=0; i<arr.length; i++) {
			System.out.printf("Nhap phan tu arr[%d] : ", i);
			arr[i] = scanner.nextInt();
		}
		return arr;
	}
	
	private static double trungBinhCong(int[] arr) {
		double TB = 0;
		int count = arr.length;
		int sum =0;
		for(int arrX : arr) {
			sum = sum + arrX;
		}
		TB = (float)sum/count;
		return TB;	
	}
	
	private static int[] xuatLapPhuong(int[] arr) {
		int[] newArr = new int[arr.length];
		for(int i=0; i< arr.length; i++) {
			newArr[i] = (int) Math.pow(arr[i], 3);
		}
		return newArr;
	}

}
