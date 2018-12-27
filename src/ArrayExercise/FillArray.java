package ArrayExercise;

import java.util.Arrays;

public class FillArray {
	public static void main(String[] args) {
		int[] arrInt = {1, 3, 2, 6, 0};
		Arrays.fill(arrInt, 5);
		System.out.println("Array after filling a value for all : " + Arrays.toString(arrInt));
		
		String[] arrString = {"a", "b", "f", "e", "g"};
		Arrays.fill(arrString, 2, 5, "d"); //Muon fill toi phan tu cuoi cung, tuc la endIndex = length
		System.out.println("Array after filling a value for some : " + Arrays.toString(arrString));
	}

}
