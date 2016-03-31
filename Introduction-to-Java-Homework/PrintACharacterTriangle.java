import java.util.Scanner;

public class PrintACharacterTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int count = 1;
        int length = n * 2 - 1;

        for (int i = 0; i < length; i++) {
            char ch = 'a';

            for (int j = 0; j < count; j++) {
                System.out.print(ch++);
            }

            System.out.println();

            if (i < n - 1) {
                count++;
            } else {
                count--;
            }
        }
    }
}
