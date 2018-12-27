package ArrayExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Merge 2 mang voi nhau theo hai cach
//Cach 1 : dung method tinh toan binh thuong
//Cach 2 : dung ArrayList

public class MergeArrays {
	public static void main(String[] args) {
		String a[] = {"a", "b", "c"};
		String b[] = {"d", "e", "f"};
		
		Object[] mergedArr = collectionsWay(a,b);
		System.out.println("The result merges two arrays following collections way : " + Arrays.toString(mergedArr));
		
		String[] mergedArrNormalWay = normalWay(a, b);
		System.out.println("The result merges two arrays following normal way : " + Arrays.toString(mergedArrNormalWay));
		
	}
	
	private static Object[] collectionsWay(String[] arr1, String[] arr2 ) {
		List list = new ArrayList();
		list.addAll(Arrays.asList(arr1));
		list.addAll(Arrays.asList(arr2));
		
		Object[] mergedArr = list.toArray(); 
		return mergedArr;
	}
	
	private static String[] normalWay(String[] arr1, String[] arr2) {
		String[] mergedArr = new String[arr1.length + arr2.length];
		for(int i=0; i < arr1.length; i++) {
			mergedArr[i] = arr1[i];
		}
		for(int j=0, i = arr1.length; j < arr2.length; j++, i++) {
			mergedArr[i] = arr2[j];
		}
		return mergedArr;
	}

}
