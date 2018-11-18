package ArrayExercise;

import java.util.Arrays;
import java.util.Scanner;

//Nhap mang sau do copy thanh mang moi
//Su dung System.arraycopy(src, srcPos, dest, destPos, length);
// Copy length phan tu index srcPos cua mang src sang mang moi, tai index destPos cua mang dest

public class CopyArray {
	public static void main(String[] args) {
		int[] src = nhapMang();
		System.out.println("src = " + Arrays.toString(src));
		int[] dest = new int[src.length -2];
		System.arraycopy(src, 1, dest, 0, src.length-2);
		System.out.println("dest = " + Arrays.toString(dest));
		
	}
	
	private static int[] nhapMang() {
		Scanner scanner = new Scanner(System.in);
		int length;
		do {
			System.out.println("Nhap so phan tu mang : ");
			length = scanner.nextInt();
		}while(length < 0);
		int[] arr = new int[length];
		
		System.out.println("Nhap mang...");
		for(int i=0; i<length; i++) {
			System.out.printf("Nhap a[%d] : ", i);
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		return arr;
	}

}
