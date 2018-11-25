package ArrayExercise;

import java.util.Arrays;
import java.util.Scanner;

//Hay nhap 2 mang so nguyen thanh 1 
//Hay nhap 2 mang string thanh 1

public class MergeArray {
	public static void main(String[] args) {
		Object[] obj = nhapMangSoNguyen();
		//int[] arrInt1 = (int[]) obj[1];
		//System.out.println(Arrays.deepToString(obj[0]));
		
	}

	private static Object[] nhapMangSoNguyen() {
		Scanner scanner = new Scanner(System.in);
		int length1, length2;
		
		do {
			System.out.println("Nhap length cua mang 1 ...");
			length1 = scanner.nextInt();
		}while(length1 < 0);
		
		int[] arrInt1 = new int[length1];
		for(int i=0; i < length1; i++) {
			System.out.printf("Nhap arrInt1[%d] : ", i);
			scanner.nextInt();
		}
		
		do {
			System.out.println("Nhap length cua mang 2...");
			length2 = scanner.nextInt();
		}while(length2 < 0);
		int[] arrInt2 = new int[length2];
		for(int i =0; i < length2; i++) {
			System.out.printf("Nhap arrInt2[%d] : ", i);
			scanner.nextInt();
		}
		scanner.close();
		return new Object[]{arrInt1, arrInt2};
	}
	
	
}
