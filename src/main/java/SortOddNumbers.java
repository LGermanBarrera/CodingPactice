package barreraGermanPractice;

import java.util.*;

public class SortOddNumbers {
    /**
     * You will be given an array of numbers.
     * You have to sort the odd numbers in ascending order while
     * leaving the even numbers at their original positions.
     *
     * Examples
     * [7, 1]  =>  [1, 7]
     * [5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
     * [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
     */
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] sortedArr = sortOddNumbers(arr);
        System.out.println("Sorted array with odd numbers in ascending order:");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }

    public static int[] sortOddNumbers(int[] arr) {
        // Create a list to store odd numbers and their indices
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> oddIndices = new ArrayList<>();

        // Identify odd numbers and store their indices and values
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddNumbers.add(arr[i]);
                oddIndices.add(i);
            }
        }

        // Sort the odd numbers in ascending order
        Collections.sort(oddNumbers);

        // Replace the original odd numbers with the sorted odd numbers
        for (int i = 0; i < oddIndices.size(); i++) {
            arr[oddIndices.get(i)] = oddNumbers.get(i);
        }

        return arr;
    }

}
