package com.company;


import java.util.Scanner;

public class CountAllWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("[^A-Za-z]+");

        System.out.println(input.length);
    }
}
