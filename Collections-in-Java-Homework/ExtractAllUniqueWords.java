package com.company;


import java.util.Scanner;
import java.util.TreeSet;

public class ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("[\\W]+");

        TreeSet<String> uniqueWords = new TreeSet<>();

        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }

        for (String uniqueWord : uniqueWords) {
            System.out.print(uniqueWord + " ");
        }
    }
}
