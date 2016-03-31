import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomizeNumbersFromNtoM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int loopLength = Math.abs(start - end);

        Random random = new Random();

        ArrayList<Integer> randomInts = new ArrayList<>();

        int smallest = start < end ? start : end;

        while (randomInts.size() <= loopLength) {
            int x = random.nextInt(Math.abs(start - end) + 1) + smallest;

            if (!randomInts.contains(x)) {
                randomInts.add(x);
            }
        }

        for (Integer randomInt : randomInts) {
            System.out.print(randomInt + " ");
        }
    }
}
