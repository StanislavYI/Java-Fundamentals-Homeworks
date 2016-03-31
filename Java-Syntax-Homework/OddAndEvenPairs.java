import java.util.Arrays;
import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.asList(scanner.nextLine()
                .trim().split("\\s+")).stream()
                .mapToInt(Integer::new).toArray();

        if (numbers.length % 2 == 0) {
            for (int i = 0; i < numbers.length - 1; i += 2) {
                int firstNum = numbers[i];
                int secondNum = numbers[i + 1];

                if (firstNum % 2 == 0 &&
                        secondNum % 2 == 0) {
                    System.out.printf("%d, %d -> both are even\n",
                            firstNum, secondNum);
                } else if (firstNum % 2 != 0 &&
                        secondNum % 2 != 0) {
                    System.out.printf("%d, %d -> both are odd\n",
                            firstNum, secondNum);
                } else if ((firstNum % 2 != 0 && secondNum % 2 == 0) ||
                        firstNum % 2 == 0 && secondNum % 2 != 0) {
                    System.out.printf("%d, %d -> differrent\n",
                            firstNum, secondNum);
                }
            }
        } else {
            System.out.println("Invalid length");
        }
    }
}
