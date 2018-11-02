package java1.slide3;

//Tinh trung binh cong cac so chia het cho 3 tu 27 den 250

public class WhileLoopExercise2 {
	public static void main(String[] args) {
		int count = 0;
		int total = 0;
		int i = 27;
		while(i<251) {
			if(i%3 == 0) {
				total = total + i;
				count = count + 1;
			}
			i++;
		}
		
		System.out.println("Trung binh cong cac so chia het cho 3 tu 27 den 250 : " + total/count);
		
	}

}
