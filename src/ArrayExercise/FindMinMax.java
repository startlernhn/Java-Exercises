package ArrayExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Nhap Mang so nguyen roi tim min, max theo 2 cach:
//Cach 1 : lap trinh binh thuong
//Cach 2 : Collections

public class FindMinMax {
	public static void main(String[] args) {
		int[] arrInt = nhapMangSoNguyen();
		System.out.println("Mang so nguyen sau khi nhap " + Arrays.toString(arrInt));
		
		collectionsWay(arrInt);
		normalWay(arrInt);
	}
	
	private static void normalWay(int[] arrInt) {
		System.out.println("Sap xep mang so nguyen theo thu tu giam dan voi ham Arrays.sort() nek...");
		Arrays.sort(arrInt);
		System.out.println("Mang theo thu tu giam dan : " + Arrays.toString(arrInt));
		System.out.println("Min = " + arrInt[0]);
		System.out.println("Max = " + arrInt[arrInt.length -1]);
	}
	
	private static void collectionsWay(int[] arrInt) {
		System.out.println("Tim min, max theo collections...");
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		//ArrayList list = new ArrayList();  khai bao list cach nao cung duoc
		for (int number : arrInt) {
			list.add(number);
		}
		
		System.out.println("List = " + list);
		System.out.println("Min = " + Collections.min(list));
		System.out.println("Max = " + Collections.max(list));
		
	}

	private static int[] nhapMangSoNguyen() {
		Scanner scanner = new Scanner(System.in);
		int length;
		do {
			System.out.println("Nhap so luong phan tu trong mang...");
			length = scanner.nextInt();
		} while (length < 0);

		int[] arrInt = new int[length];
		for(int i=0; i < length; i++) {
			System.out.println("Nhap phan tu thu " + i);
			arrInt[i] = scanner.nextInt();
		}
		scanner.close();

		return arrInt;
	}
}
