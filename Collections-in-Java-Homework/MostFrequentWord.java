package com.company;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("[\\W]+");

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        for (String word : words) {
            String ignoreCase = word.toLowerCase();

            if (!treeMap.containsKey(ignoreCase)) {
                treeMap.put(ignoreCase, 0);
            }

            treeMap.put(ignoreCase, treeMap.get(ignoreCase) + 1);
        }

        int max = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            if (max < entry.getValue()) {
                max = entry.getValue();
            }
        }

        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey() + " -> " + entry.getValue() + " times");
            }
        }
    }
}
