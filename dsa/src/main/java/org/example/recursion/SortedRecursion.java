package org.example.recursion;

/**
 * Given an array, check whether the array is in sorted order with recursion.
 */
public class SortedRecursion {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{3, 2, 5, 7, 1};

        System.out.println("arr1 is sorted => " + isSorted(arr1, 5));
        System.out.println("arr2 is sorted => " + isSorted(arr2, 5));
    }

    public static boolean isSorted(int[]A, int n) {
        // Base case: An array with 0 or 1 element is always sorted
        if (n <= 1) {
            return true;
        }

        // Check if last 2 elements are sorted
        if (A[n-2] > A[n-1]) {
            return false;
        }

        // Check the remaining elements in the array
        return isSorted(A, n-1);
    }
}
