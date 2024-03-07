package barreraGermanPractice;

import java.util.Arrays;

public class SortOddNumbersWithStreamMethod {
    public static void main(String[] args) {
            int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
            int[] sortedArr = sortOddNumbers(arr);
            System.out.println("Sorted array with odd numbers in ascending order:");
            Arrays.stream(sortedArr).forEach(num -> System.out.print(num + " "));
        }

        public static int[] sortOddNumbers(int[] arr) {
            // Filter odd numbers, sort them, and collect into an array
            int[] sortedOddNumbers = Arrays.stream(arr)
                    .filter(num -> num % 2 != 0)
                    .sorted()
                    .toArray();

            // Replace odd numbers in the original array with the sorted odd numbers
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    arr[i] = sortedOddNumbers[index++];
                }
            }

            return arr;
        }
}
