package com.company;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String targetWord = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\b(?i)(" + targetWord + ")\\b");
        Matcher matcher = pattern.matcher(text);

        int count = 0;

        while (matcher.find()) {
            count++;
        }

        System.out.println(count);
    }
}
