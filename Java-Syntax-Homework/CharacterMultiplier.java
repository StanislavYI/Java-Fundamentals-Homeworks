import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");

        System.out.println(sum(strings[0], strings[1]));
    }
    public static int sum(String first, String second) {
        String smallest;
        String biggest;

        if (first.length() < second.length()) {
            smallest = first;
            biggest = second;
        } else {
            smallest = second;
            biggest = first;
        }

        int index;
        int result = 0;

        for (index = 0; index < smallest.length(); index++) {
            result += smallest.charAt(index) *
                    biggest.charAt(index);
        }

        for (int i = index; i < biggest.length(); i++) {
            result += biggest.charAt(index);
        }

        return result;
    }
}
