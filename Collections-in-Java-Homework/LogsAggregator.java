package com.company;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        TreeMap<String, TreeSet<String>> first = new TreeMap<>();
        TreeMap<String, Integer> second = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("[\\s]+");

            String name = line[1];
            String ip = line[0];
            int duration = Integer.parseInt(line[2]);

            if (!first.containsKey(name)) {
                first.put(name, new TreeSet<>());
            }
            first.get(name).add(ip);

            if (!second.containsKey(name)) {
                second.put(name, 0);
            }
            second.put(name, second.get(name) + duration);
        }

        for (Map.Entry<String, Integer> entry : second.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " " + first.get(entry.getKey()));
        }
    }
}
