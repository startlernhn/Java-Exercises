package java1.slide3;

// Xuat ra bang cuu chuong voi vong lap for
public class ForLoopExercise1 {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			System.out.printf("Cuu chuong %d: \n", i);
			for (int k = 1; k < 10; k++) {
				System.out.printf("%dx%d = %d \t", i, k, i * k);
			}
			System.out.print("\n");
		}
	}

}
