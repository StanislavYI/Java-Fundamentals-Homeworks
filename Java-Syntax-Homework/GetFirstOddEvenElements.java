import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GetFirstOddEvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.asList(scanner.nextLine().split("\\s+"))
                .stream().mapToInt(Integer::new).toArray();
        String[] command = scanner.nextLine().split("\\s+");

        ArrayList<Integer> result = returnElements(numbers, command[2],
                Integer.parseInt(command[1]));

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
    public static ArrayList<Integer> returnElements(int[] numbers, String parity, int length) {
        ArrayList<Integer> result = new ArrayList<>();

        int index = 0;
        int count = 0;

        while (index < numbers.length && count < length) {
            if (parity.equals("even")) {
                if (numbers[index] % 2 == 0) {
                    result.add(numbers[index]);
                    count++;
                }
                index++;
            } else {
                if (numbers[index] % 2 != 0) {
                    result.add(numbers[index]);
                    count++;
                }
                index++;
            }
        }

        return result;
    }
}
