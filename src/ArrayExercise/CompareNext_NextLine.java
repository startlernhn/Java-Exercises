package ArrayExercise;

import java.util.Scanner;

//Phan biet 2 method khi nhan gia tri nhap tu keyboard : .next() va .nextLine()
// .next(); chi tra ve noi dung truoc khoang trang
// .nextLine() : tra ve gia tri cua 1 dong (hang) tuc la den khi gap dau xuong dong (enter)
public class CompareNext_NextLine {
	public static void main(String[] args) {
		compareNext_NextLine();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ho ten sinh vien muon tim kiem...");
		String hoTen = scanner.nextLine();
		if(checkSinhVien(hoTen)) {
			System.out.println("Sinh vien nay co ten trong danh sach");
		}else {
			System.out.println("Sinh vien nay khong co ten trong danh sach");
		}
		scanner.close();
		//nextLine exercise : nhap 1 ho ten sinh vien, kiem tra xem sinh vien do co ten trong danh sach ko?
	}
	
	private static void compareNext_NextLine() {
		String test = "Truong Han!\n20 06 1994 \n hihi";
		Scanner scan = new Scanner(test);
		
		System.out.println("Testing method scan.next()...");
		System.out.println(scan.next()); //expected is Truong
		System.out.println(scan.next()); //expected is Han!
		System.out.println(scan.next()); //expected is 20
		
		
		System.out.println("Testing method scan.nextLine()...");
		System.out.println(scan.nextLine()); //expected is 06 1994
		System.out.println(scan.nextLine()); //expected is hihi
		
		scan.close();
	}
	
	private static boolean checkSinhVien(String hoTen) {
		Scanner scanner = new Scanner(System.in);
		int count;
		do {
			System.out.println("Nhap so luong sinh vien...");
			count = scanner.nextInt();
		}while(count < 0);
		
		String[] sv = new String[count];
		scanner.nextLine();
		for(int i=0; i < sv.length; i++) {
			System.out.printf("Nhap sv[%d] : ", i);
			sv[i] = scanner.nextLine();
		}
		
		for(int k=0; k < count; k++) {
			if(hoTen.equals(sv[k])) {
				return true;
			}
		}
		scanner.close();
		return false;
	}

}
