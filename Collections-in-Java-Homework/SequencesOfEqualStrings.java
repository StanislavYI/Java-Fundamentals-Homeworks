package com.company;


import java.util.Scanner;

public class SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("[\\s]+");

        for (int i = 0; i < words.length - 1; i++) {
            String firstWord = words[i];
            String secondWord = words[i + 1];

            if (!firstWord.equals(secondWord)) {
                System.out.println(firstWord + " ");
            } else {
                System.out.print(firstWord + " ");
            }
        }

        System.out.println(words[words.length - 1]);
    }
}

