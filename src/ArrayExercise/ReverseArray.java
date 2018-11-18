package ArrayExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import javafx.print.Collation;

//Nhap 1 String roi tach thanh mang cac ky tu char, sau do dao nguoc mang char do

public class ReverseArray {
	public static void main(String[] args) {
		//System.out.println("Mang string...");
		//String[] str = nhapMangString();
		//System.out.println("Mang string = " + Arrays.toString(str));
		
		System.out.println("Nhap 1 chuoi string r se chuyen sang mang ky tu char...");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		char[] charArray = convertStringToArray(str);
		System.out.println(Arrays.toString(charArray));
		
		ArrayList arrayList = new ArrayList();
		for(int i=0; i < charArray.length; i++) {
			arrayList.add(charArray[i]);
		}
		scanner.close();
		
		System.out.println("Before reverse order...");
		System.out.println(arrayList);
		Collections.reverse(arrayList);
		
		System.out.println("Afteer reverse order...");
		System.out.println(arrayList);
		
	}
	
	private static String[] nhapMangString() {
		Scanner scanner = new Scanner(System.in);
		int length;
		do {
			System.out.println("Nhap so phan tu mang string : ");
			length = scanner.nextInt();
		}while(length < 0);
		String[] str = new String[length];
		scanner.nextLine(); // Neu ko co dong code nay thi str[0] se k dc nhap vi sau khi length = scanner.nextInt()
	//thi java chi day so luu vao bien length, con dau enter van con luu trong bo nho
	//Ma scanner.nextLine() la nhan vao mot String nhap vao tu ban phim va KET THUC khi gap xuong dong enter
	//Nen str[0] da nhan enter luu o tren nhu la ket thuc viec nhap vao mot String r nen no bo qua str[0] lun
		for(int i=0; i < length; i++) {
			System.out.printf("Nhap str[%d] :", i);
			str[i] = scanner.nextLine();
		}
		scanner.close();
		return str;
	}
	
	
	//Nhap 1 chuoi string roi chuyen dang mang ky tu char
	private static char[] convertStringToArray(String str) {
		char[] character = str.toCharArray();
		//for(int i=0; i < character.length; i++) {
		//	System.out.print(character[i] + " ,");
		//}
		//System.out.println(Arrays.toString(character));  //Cach khac de in mang ra console
		return character;
	}
	
	

}
