import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] frases = new String[3];
        for (int i = 0; i < 3; i++) {
            frases[i] = scanner.nextLine();
        }

        System.out.println(frases[0] + "\n" + frases[1] + "\n" + frases[2]);
        System.out.println(frases[1] + "\n" + frases[2] + "\n" + frases[0]);
        System.out.println(frases[2] + "\n" + frases[0] + "\n" + frases[1]);

        System.out.println(frases[0].substring(0, 10) + "\n" + frases[1].substring(0, 10) + "\n" + frases[2].substring(0, 10));
    }
}