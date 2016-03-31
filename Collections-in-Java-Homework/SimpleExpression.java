package com.company;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class SimpleExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        String[] numbers = removeEmptyEntries(input
                .split("[\\s\\-+]+")).toArray(new String[0]);

        ArrayList<String> expressions = removeEmptyEntries(input.split("[\\d\\s.]+"));

        BigDecimal result = new BigDecimal(numbers[0]);

        for (int i = 1; i < numbers.length; i++) {
            BigDecimal dbNum = new BigDecimal(numbers[i]);

            if (expressions.get(i - 1).equals("-")) {
                result = result.subtract(dbNum);
            } else {
                result = result.add(dbNum);
            }
        }

        System.out.println(result);
    }

    public static ArrayList<String> removeEmptyEntries(String[] array) {
        ArrayList<String> result = new ArrayList<>();

        for (String s : array) {
            if (!s.equals("")) {
                result.add(s);
            }
        }

        return result;
    }
}
