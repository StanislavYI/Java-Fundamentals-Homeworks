import java.util.Scanner;

public class HitTheTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int a = 1; a <= 20; a++) {
            for (int b = 1; b <= 20; b++) {
                if (a + b == n) {
                    System.out.printf("%d + %d = %d\n",
                            a, b, n);
                } else if (a - b == n) {
                    System.out.printf("%d - %d = %d\n",
                            a, b, n);
                }
            }
        }
    }
}
