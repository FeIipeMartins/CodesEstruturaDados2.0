package ExerceciosListaLSE;

import java.util.Scanner;

import AHHH.LSE;

public class Bee2006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tipo de chá real
        int tipoCháReal = scanner.nextInt();

        // Respostas dos competidores
        LSE<Integer> respostas = new LSE<>();
        for (int i = 0; i < 5; i++) {
            respostas.adiciona(scanner.nextInt());
        }

        // Contagem de respostas corretas
        int respostasCorretas = 0;
        for (int i = 0; i < respostas.getTamanho(); i++) {
            if (respostas.buscaPorPosicao(i) == tipoCháReal) {
                respostasCorretas++;
            }
        }

        System.out.println(respostasCorretas);
    }
}
