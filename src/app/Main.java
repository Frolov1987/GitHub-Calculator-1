package app;

public class Main {
    static int a = 8;
    static int b = 2;
    static int c;
    static int f;
    static int d;
    static int g;
    public static void main(String[] args) {
        System.out.println("My app for Users!");
        System.out.println("Version 1.0");

        c = add(a, b);
        System.out.println(c);
        d = multiply(a, b);
        System.out.println(d);

        f = subtraction(a, b);
        System.out.println(f);

        g = division(a, b);
        System.out.println(g);

    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int subtraction(int a, int b ) {
        return a - b; }

    private static int division (int a, int b ) {
        return a / b;
    }
}
