package com.company;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CardsFrequencies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cards = scanner.nextLine().split("[\\s]+");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (String card : cards) {
            card = card.substring(0, card.length() - 1);

            if (!map.containsKey(card)) {
                map.put(card, 0);
            }

            map.put(card, map.get(card) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            double frequency = (entry.getValue() / (double)cards.length) * 100;

            System.out.printf("%s -> %.2f", entry.getKey(), frequency);
            System.out.println("%");
        }
    }
}
