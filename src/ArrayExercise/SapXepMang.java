package ArrayExercise;

import java.util.Arrays;
import java.util.Scanner;

public class SapXepMang {
	public static void main(String[] args) {
		int[] arr = nhapMang();
		System.out.println("arr[] = " + Arrays.toString(arr));
		
		System.out.println("Mang sau khi dao nguoc : " + Arrays.toString(daoNguocMang(arr)));
		
		int[] newArrTangDan1 = sapXepMangTangDan(arr);
		System.out.println("Mang arr[] tang dan dung method tu viet : " + Arrays.toString(newArrTangDan1));
		//Thay vi dung method tu viet de sap xep mang tang dan thi java cung ho tro ham co san 
		//Arrays.sort(); de sap xep mang tang dan
		//Con sap xep mang giam dan thi k co san, phai dung method viet ben duoi
		Arrays.sort(arr);
		System.out.println("Mang arr[] tang dan theo method co san : " + Arrays.toString(arr));
		
		int index1 = Arrays.binarySearch(arr, 3); //Arrays.binarySearch(arr, key) chi dung cho mang da dc sap xep giam dan
		System.out.println("Found 3 in at index : " + index1);
		
		//Dao nguoc mang tang dan, ta duoc mang giam dan Va nguoc lai
		System.out.println("Dao nguoc mang tang dan, se duoc mang giam dan : " + Arrays.toString(daoNguocMang(arr)));
	
		System.out.println("Mang arr[] giam dan : " + Arrays.toString(sapXepMangGiamDan(arr)));
		
	}

	private static int[] nhapMang() {
		Scanner scanner = new Scanner(System.in);
		int a;
		do {
			System.out.println("Nhap so phan tu mang : ");
			a = scanner.nextInt();
		} while (a < 0);
		
		int[] arr = new int[a];
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("Nhap a[%d] : ", i);
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		return arr;
	}
	
	private static int[] sapXepMangTangDan(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	private static int[] sapXepMangGiamDan(int[] arr) {
		int temp;
		for(int i = 0; i < arr.length -1; i++) {
			for(int k = i+1; k < arr.length; k++) {
				if(arr[i] < arr[k]) {
					temp = arr[i];
					arr[i] = arr[k];
					arr[k] = temp;
				}
			}
		}
		return arr;
	}
	
	private static int[] daoNguocMang(int[] arr) {
		int[] newArr = new int[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--,j++) {
			newArr[j] = arr[i];
		}
		return newArr;
	}
}
