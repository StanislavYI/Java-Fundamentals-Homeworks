package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("[\\s]+");

        ArrayList<ArrayList<String>> sequences = new ArrayList<>();
        ArrayList<String> inner = new ArrayList<>();

        for (int i = 0; i < strings.length - 1; i++) {
            String first = strings[i];
            String second = strings[i + 1];

            inner.add(first);

            if (!first.equals(second)) {
                sequences.add(inner);

                inner = new ArrayList<>();
            }
        }

        inner.add(strings[strings.length - 1]);
        sequences.add(inner);

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < sequences.size(); i++) {
            if (sequences.get(i).size() > max) {
                max = sequences.get(i).size();
            }
        }

        for (int i = 0; i < sequences.size(); i++) {
            if (sequences.get(i).size() == max) {
                String output = sequences.get(i).toString();

                System.out.println((output.substring(1,
                        output.length() - 1)).replace(",", ""));

                break;
            }
        }
    }
}
