import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ax = scanner.nextInt();
        int ay = scanner.nextInt();
        int bx = scanner.nextInt();
        int by = scanner.nextInt();
        int cx = scanner.nextInt();
        int cy = scanner.nextInt();

        double area = (ax * (by - cy) + bx * (cy - ay) + cx * (ay - by)) / 2d;

        System.out.println((int) Math.abs(area));
    }
}
