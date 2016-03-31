package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstInput = scanner.nextLine().split("[\\s]+");
        String[] secondInput = scanner.nextLine().split("[\\s]+");

        ArrayList<Character> l1 = convertToList(firstInput);
        ArrayList<Character> l2 = convertToList(firstInput);
        ArrayList<Character> l3 = convertToList(secondInput);

        for (int j = 0; j < l3.size(); j++) {
            char ch = l3.get(j);

            if (!l1.contains(ch)) {
                l2.add(l3.get(j));
            }
        }

        for (Character character : l2) {
            System.out.print(character + " ");
        }
    }

    public static ArrayList<Character> convertToList(String[] array) {
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            list.add((array[i].charAt(0)));
        }

        return list;
    }
}
