package barreraGermanPractice;

import java.util.ArrayList;
import java.util.List;

public class SortOddNumbersWithInnerForLoop {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 4, 8, 3, 7, 1};
        int[] sortedArr = sortOddNumbers(arr);
        System.out.println("Sorted array with odd numbers in ascending order:");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }

    public static int[] sortOddNumbers(int[] arr) {
        // Create a list to store odd numbers
        List<Integer> oddNumbers = new ArrayList<>();

        // Identify and store odd numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddNumbers.add(arr[i]);
            }
        }

        // Sort the odd numbers in ascending order using nested loops
        for (int i = 0; i < oddNumbers.size() - 1; i++) {
            for (int j = 0; j < oddNumbers.size() - i - 1; j++) {
                if (oddNumbers.get(j) > oddNumbers.get(j + 1)) {
                    // Swap elements if they are in the wrong order
                    int temp = oddNumbers.get(j);
                    oddNumbers.set(j, oddNumbers.get(j + 1));
                    oddNumbers.set(j + 1, temp);
                }
            }
        }

        // Replace the original odd numbers with the sorted odd numbers
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = oddNumbers.get(index++);
            }
        }

        return arr;
    }
}
