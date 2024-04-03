

import java.util.Scanner;

public class QuantasChamadas {
    static int cont = 0;

    static int fibonacci(int n) {
        cont++;
        if (n == 0 || n == 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n-- > 0) {
            int fib = scanner.nextInt();
            System.out.printf("fib(%d) = %d calls = %d%n", fib, cont - 1, fibonacci(fib));
            cont = 0;
        }
    }
}