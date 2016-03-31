package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] nums = Arrays.asList(scanner.nextLine().split("[\\s]+"))
                .stream().mapToInt(Integer::new).toArray();

        Arrays.sort(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
