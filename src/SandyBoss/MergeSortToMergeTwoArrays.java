package SandyBoss;

import java.util.Arrays;

public class MergeSortToMergeTwoArrays {
	
	public static void main(String [] args) {
		int[] array1 = {3,2,1};
        int[] array2 = {7,6,5};

        // Merge the arrays
        int[] mergedArray = merge(array1, array2);

        // Print the merged array
        System.out.println(Arrays.toString(mergedArray));
    }

    public static int[] merge(int[] array1, int[] array2) {
        // Get the lengths of the input arrays
        int n = array1.length;
        int m = array2.length;

        // Create a new array to hold the merged result
        int[] mergedArray = new int[n + m];

        // Initialize pointers for array1, array2, and mergedArray
        int i = 0, j = 0, k = 0;

        // Traverse both arrays and copy the smaller element to mergedArray
        while (i < n && j < m) {
            if (array1[i] <= array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        // Copy remaining elements of array1, if any
        while (i < n) {
            mergedArray[k++] = array1[i++];
        }

        // Copy remaining elements of array2, if any
        while (j < m) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
	}
}
