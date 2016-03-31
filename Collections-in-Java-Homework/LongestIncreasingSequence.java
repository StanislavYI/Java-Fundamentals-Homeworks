package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.asList(scanner.nextLine().split("[\\s]+"))
                .stream().mapToInt(Integer::new).toArray();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> inner = new ArrayList<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            int first = numbers[i];
            int second = numbers[i + 1];

            inner.add(first);

            if (first >= second) {
                list.add(inner);

                inner = new ArrayList<>();
            }
        }

        inner.add(numbers[numbers.length - 1]);
        list.add(inner);

        for (ArrayList<Integer> integers : list) {
            String str = integers.toString().replace(", ", " ");

            System.out.println(str.substring(1, str.length() - 1));
        }

        System.out.println("Longetst: " + findLongest(list));
    }

    public static String findLongest(ArrayList<ArrayList<Integer>> list) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i).size()) {
                max = list.get(i).size();
            }
        }

        String output = "";

        for (int i = 0; i < list.size(); i++) {
            if (max == list.get(i).size()) {
                output = list.get(i).toString().replace(", ", " ");

                break;
            }
        }

        output = output.substring(1, output.length() - 1);

        return output;
    }
}
