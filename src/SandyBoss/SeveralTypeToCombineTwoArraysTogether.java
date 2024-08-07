package SandyBoss;

import java.util.Arrays;
import java.util.stream.Stream;

public class SeveralTypeToCombineTwoArraysTogether {
	
	public static void main(String [] args) {
		int arr1[] = {1,2,3};
		int arr2[] = {4,5,6};
		
//		Approach 1 by using System.arraycopy();		
		int mergeArray [] = new int[arr1.length+arr2.length];
		System.arraycopy(arr1, 0, mergeArray, 0, arr1.length);
		System.arraycopy(arr2, 0, mergeArray, arr1.length,arr2.length );
		System.out.println(Arrays.toString(mergeArray));
		
//		Approach 2 Arrays.copyOf();
//		int mergeArray [] = Arrays.copyOf(arr1, arr1.length+arr2.length);
//		System.arraycopy(arr2, 0, mergeArray, arr1.length, arr2.length);
//		System.out.println(Arrays.toString(mergeArray));
		
//		Approach 3 by using List and addAll		
//		Integer array1[] = {1,2,3};
//		Integer array2[] = {4,5,6};		
//		List<Integer> list = new ArrayList<>(Arrays.asList(array1));
//		list.addAll(Arrays.asList(array2));
		
//		Integer[] mergeArray = list.toArray(new Integer[0]);
//		System.out.println(Arrays.toString(mergeArray));
		
//		Appraoch 4 by using Java 8 stream.
//		Integer [] array1 = {1,2,3};
//		Integer [] array2 = {4,5,6};		
//		Integer [] mergeArray = Stream.concat(Arrays.stream(array1), Arrays.stream(array2))
//				.toArray(Integer[]::new);
//		System.out.println(mergeArray);
	}

}
