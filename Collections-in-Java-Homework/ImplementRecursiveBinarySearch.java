package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class ImplementRecursiveBinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = Integer.parseInt(scanner.nextLine());

        int[] numbers = Arrays.asList(scanner.nextLine().split("[\\s]+"))
                .stream().mapToInt(Integer::new).toArray();

        if (target < numbers[0] ||
                target > numbers[numbers.length - 1]) {
            System.out.println(-1);
        } else {
            int middle = (numbers.length - 1) / 2;
            int result = binarySearch(target, numbers, middle);

            System.out.println(result);
        }
    }

    public static int binarySearch(int target, int[] numbers, int middle) {
        if (numbers[middle] < target) {
            return binarySearch(target, numbers, middle + 1);
        } else if (numbers[middle] > target) {
            return binarySearch(target, numbers, middle - 1);
        } else {
            return middle;
        }
    }
}
