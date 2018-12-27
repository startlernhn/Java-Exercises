package ArrayExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Xoa 1 phan tu trong mang
//Xoa tuc la thay doi kich thuoc cua mang, nen phai chuyen sang ArrayList

public class RemoveElement {
	public static void main(String[] args) {
		int[] arrInt = {1,7,3,5,0};
		
		Arrays.sort(arrInt);
		int index = Arrays.binarySearch(arrInt, 3);
		System.out.println(index);
		ArrayList list = new ArrayList();
		for(int i =0; i < arrInt.length; i ++) {
			list.add(i, arrInt[i]);
		}
		list.remove(index);
		System.out.println(list);
		
		list.clear();
		list.add(0, "school");
		list.add(1, "companny");
		list.add(2, "cinema");
		list.add(3, "super markket");
		list.remove("cinema");
		System.out.println("After removing : " + list);
		
		
	}

}
