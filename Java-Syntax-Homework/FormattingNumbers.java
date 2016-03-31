import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        String bFormat = String.format("%.2f", b);
        String cFormat = String.format("%.3f", c);

        String binaryPadding = String.format("%10s", binary(a))
                .replace(' ', '0');

        System.out.printf("|%-10s|%s|%10s|%-10s|",
                hex(a), binaryPadding, bFormat, cFormat);
    }

    public static String reverse(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(str.length() - i - 1);
        }

        return result;
    }

    public static String binary(int decimal) {
        int first = decimal;
        int second = decimal;

        String result = "";

        if (first == 0) {
            result += 0;
        }

        while (first > 0) {
            first %= 2;
            second /= 2;

            result += first;

            first = second;
        }

        return reverse(result);
    }

    public static String hex(int decimal) {
        String[] hexadecimal = { "0", "1", "2", "3", "4", "5",
                "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };

        int first = decimal;
        int second = decimal;

        String result = "";

        if (first == 0) {
            result += hexadecimal[first];
        }

        while (first > 0) {
            first %= 16;
            second /= 16;

            result += hexadecimal[first];

            first = second;
        }

        return reverse(result);
    }
}
