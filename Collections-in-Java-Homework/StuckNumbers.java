package com.company;


import java.util.Scanner;

public class StuckNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] numbers = scanner.nextLine().split("[\\s]+");

        boolean isNotEqual = true;

        for (int a = 0; a < numbers.length; a++) {
            for (int b = 0; b < numbers.length; b++) {
                for (int c = 0; c < numbers.length; c++) {
                    for (int d = 0; d < numbers.length; d++) {
                        boolean check = !numbers[a].equals(numbers[b]) &&
                                !numbers[a].equals(numbers[c]) &&
                                !numbers[a].equals(numbers[d]) &&
                                !numbers[b].equals(numbers[c]) &&
                                !numbers[b].equals(numbers[d]) &&
                                !numbers[c].equals(numbers[d]);

                        if (check) {
                            String first = numbers[a] + numbers[b];
                            String  second = numbers[c] + numbers[d];

                            if (first.equals(second)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(numbers[a]);
                                sb.append("|");
                                sb.append(numbers[b]);
                                sb.append("==");
                                sb.append(numbers[c]);
                                sb.append("|");
                                sb.append(numbers[d]);

                                System.out.println(sb);

                                isNotEqual = false;
                            }
                        }
                    }
                }
            }
        }

        if (isNotEqual) {
            System.out.println("No");
        }
    }
}
