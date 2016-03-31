package com.company;


import java.util.Scanner;

public class CalculateNFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();

        System.out.println(factorial(n));
    }
    public static long factorial(long n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
