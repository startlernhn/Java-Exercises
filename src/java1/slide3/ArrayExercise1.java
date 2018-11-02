package java1.slide3;

import java.util.Arrays;
import java.util.Scanner;

//Hay lay so nho nhat cua mot mang boi su dung phuong thuc

public class ArrayExercise1 {
	public static void main(String[] args) {
		nhapMang();
	}

	private static void nhapMang() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Vui long nhap so phan tu cua mang ma ban muon khoi tao...");
		int count = scanner.nextInt();
		double[] arr = new double[count];
		for (int i = 0; i < count; i++) {
			System.out.printf("Vui long nhap phan tu a[%d] :", i);
			arr[i] = scanner.nextDouble();
		}
		System.out.printf("Mang arr[%d] = %s", count, Arrays.toString(arr));

	}
}
