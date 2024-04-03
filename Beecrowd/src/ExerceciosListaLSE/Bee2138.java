package ExerceciosListaLSE;

import java.util.Scanner;

public class Bee2138 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String numero = scanner.next();
            int[] frequencia = new int[10];
            for (int i = 0; i < numero.length(); i++) {
                int digito = numero.charAt(i) - '0';
                frequencia[digito]++;
            }
            int digitoMaisFrequente = 0;
            int maiorFrequencia = 0;
            for (int i = 0; i < 10; i++) {
                if (frequencia[i] > maiorFrequencia || (frequencia[i] == maiorFrequencia && i > digitoMaisFrequente)) {
                    maiorFrequencia = frequencia[i];
                    digitoMaisFrequente = i;
                }
            }
            System.out.println(digitoMaisFrequente);
        }
    }
}
