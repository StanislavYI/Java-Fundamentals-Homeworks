
public class AssignVariables {
    public static void main(String[] args) {
        byte by = 127;
        short sh = 32767;
        int i = 2_000_000_000;
        long l = 919827112351L;
        char ch = 'c';
        boolean bool = false;
        float f = 0.5f;
        double d = 0.1234567891011;
        String str = "Palo Alto, CA";

        System.out.printf("byte -> %s\n", by);
        System.out.printf("short -> %d\n", sh);
        System.out.printf("int -> %d\n", i);
        System.out.printf("long -> %d\n", l);
        System.out.printf("char -> %s\n", ch);
        System.out.printf("boolean -> %s\n", bool);
        System.out.printf("float -> %f\n", f);
        System.out.printf("double -> %f\n", d);
        System.out.printf("String -> %s", str);
    }
}
