import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double firstFormulae = Math.pow((Math.pow(a, 2) + Math.pow(b, 2)) /
                (Math.pow(a, 2) - Math.pow(b, 2)),
                (a + b + c) / Math.sqrt(c));

        double secondFormulae = Math.pow((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3)),
                (a - b));

        double firstAverage = (a + b + c) / 3d;
        double secondAverage = (firstFormulae + secondFormulae) / 2d;

        double diff = Math.abs(firstAverage - secondAverage);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",
                firstFormulae, secondFormulae, diff);
    }
}
