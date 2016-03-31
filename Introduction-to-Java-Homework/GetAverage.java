import java.util.Locale;
import java.util.Scanner;

public class GetAverage {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.2f", average(a, b, c));
    }
    public static double average(double a, double b, double c) {
        double result = a + b + c;

        result /= 3;

        return result;
    }
}
