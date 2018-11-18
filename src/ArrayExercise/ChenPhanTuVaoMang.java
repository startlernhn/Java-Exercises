package ArrayExercise;

import java.util.Arrays;
import java.util.Scanner;

//Sap xep mang theo giam dan roi chen mot phan tu vao mang tai index mong muon
public class ChenPhanTuVaoMang {
	public static void main(String[] args) {
		int[] arr = nhapMang();
		System.out.println("Mang nguyen thuy : " + Arrays.toString(arr));
		System.out.println("Mang sau khi chen int 2 vao index 3 : " + Arrays.toString(insertElement(arr, 3, 2)));
		Arrays.sort(arr);
		System.out.println("Mang giam dan : " + Arrays.toString(arr));
		System.out.println("Mang sau khi chen int 2 vao index 3 : " + Arrays.toString(insertElement(arr, 3, 2)));
	}
	
	private static int[] nhapMang() {
		Scanner scanner = new Scanner(System.in);
		int count;
		do {
			System.out.println("Nhap so phan tu mang : ");
			count = scanner.nextInt();
		}while(count<0);
		
		int[] arr = new int[count];
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("Nhap a[%d] : ",i);
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		return arr;
	}
	
	private static int[] insertElement(int[] src, int index, int element) {
		int[] newArr = new int[src.length + 1];
		System.arraycopy(src, 0, newArr, 0, index);
		newArr[index] = element;
		System.arraycopy(src, index, newArr, index+1, src.length-index);
		return newArr;
	}

}
	