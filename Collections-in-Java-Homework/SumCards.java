package com.company;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SumCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cardsFaces = scanner.nextLine().split("[SHDC\\s]+");

        int[] numbers = cardsFacesToInts(cardsFaces);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> inner = new ArrayList<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            int first = numbers[i];
            int second = numbers[i + 1];

            inner.add(first);

            if (first != second) {
                list.add(inner);

                inner = new ArrayList<>();
            }
        }

        inner.add(numbers[numbers.length - 1]);
        list.add(inner);

        int output = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).size() > 1) {
                for (int j = 0; j < list.get(i).size(); j++) {
                    output += list.get(i).get(j) * 2;
                }
            } else {
                output += list.get(i).get(0);
            }
        }

        System.out.println(output);
    }
    public static int[] cardsFacesToInts(String[] cardsFaces) {
        int[] result = new int[cardsFaces.length];

        for (int i = 0; i < result.length; i++) {
            try {
                result[i] = Integer.parseInt(cardsFaces[i]);
            } catch (NumberFormatException ex) {
                HashMap<String, Integer> map = new HashMap<>();
                map.put("J", 12);
                map.put("Q", 13);
                map.put("K", 14);
                map.put("A", 15);

                result[i] = map.get(cardsFaces[i]);
            }
        }

        return result;
    }
}
