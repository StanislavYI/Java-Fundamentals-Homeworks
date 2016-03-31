import java.util.ArrayList;
import java.util.Scanner;

public class GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        String[] ghettoSystem = { "Gee", "Bro", "Zuz", "Ma", "Duh",
                "Yo", "Dis", "Hood", "Jam", "Mack" };

        int whole = input;
        int remainder = input;

        ArrayList<Integer> remainders = new ArrayList<>();

        while (whole > 0) {
            whole /= 10;
            remainder %= 10;

            remainders.add(remainder);

            remainder = whole;
        }

        for (int i = remainders.size() - 1; i >= 0; i--) {
            System.out.print(ghettoSystem[remainders.get(i)]);
        }
    }
}
