package java1.slide3;

import java.util.Arrays;
import java.util.Scanner;

//Hay lay so nho nhat cua mot mang boi su dung phuong thuc

public class ArrayExercise1 {
	public static void main(String[] args) {
		double[] arr = nhapMang();
		double min = timMinimum(arr);
		double sum = tongSoNguyenChan(arr); //K tinh so thuc vd 2.2, 4.6
		System.out.println("So nho nhat cua mang la: " + min);
		System.out.println("Tong cac so chan cua mang la: " + sum);

	}

	private static double[] nhapMang() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Vui long nhap so phan tu cua mang ma ban muon khoi tao...");
		int count = scanner.nextInt();
		double[] arr = new double[count];
		for (int i = 0; i < count; i++) {
			System.out.printf("Vui long nhap phan tu a[%d] :", i);
			arr[i] = scanner.nextDouble();
		}
		System.out.printf("Mang arr[%d] = %s \n", count, Arrays.toString(arr));
		return arr;
	}

	private static double timMinimum(double[] srcArr) {
		double min = srcArr[0];
		for (int i = 1; i < srcArr.length; i++) {
			if (min > srcArr[i]) {
				min = srcArr[i];
			}
		}
		return min;

	}

	private static double tongSoNguyenChan(double[] srcArr) {
		double sum = 0;
		for (int i = 0; i < srcArr.length; i++) {
			if (srcArr[i] % 2 == 0) {
				sum = sum + srcArr[i];
			}
		}
		return sum;
	}
}
