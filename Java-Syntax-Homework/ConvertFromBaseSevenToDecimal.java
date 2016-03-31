import java.util.Scanner;

public class ConvertFromBaseSevenToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int baseSeven = scanner.nextInt();

        int whole = baseSeven;
        int remainder = baseSeven;

        int decimal = 0;
        int count = 0;

        while (whole > 0) {
            remainder %= 10;
            whole /= 10;

            decimal += remainder * Math.pow(7, count++);

            remainder = whole;
        }

        System.out.println(decimal);
    }
}
