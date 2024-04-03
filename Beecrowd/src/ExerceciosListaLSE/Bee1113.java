package ExerceciosListaLSE;

import java.util.Scanner;

import AHHH.LSE;

public class Bee1113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LSE<Integer> listaX = new LSE<>();
        LSE<Integer> listaY = new LSE<>();
        while (true) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x == y) {
                break; 
            }
            listaX.adiciona(x);
            listaY.adiciona(y);
        }
        for (int i = 0; i < listaX.getTamanho(); i++) {
            int x = listaX.get(i);
            int y = listaY.get(i);
            if (x < y) {
                System.out.println("Crescente");
            } else {
                System.out.println("Decrescente");
            }
        }
    }
}
