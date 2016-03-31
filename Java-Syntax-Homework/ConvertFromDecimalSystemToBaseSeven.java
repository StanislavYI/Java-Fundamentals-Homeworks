import java.util.Scanner;

public class ConvertFromDecimalSystemToBaseSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = scanner.nextInt();

        int whole = decimal;
        int remainder = decimal;

        String sevenBase = "";

        if (decimal == 0) {
            sevenBase = "0";
        }

        while (whole > 0) {
            remainder %= 7;
            whole /= 7;

            sevenBase += remainder;

            remainder = whole;
        }

        System.out.println(reverse(sevenBase));
    }

    public static String reverse(String number) {
        String result = "";

        for (int i = 0; i < number.length(); i++) {
            result += number.charAt(number.length() - i - 1);
        }

        return result;
    }
}
