package ExerceciosListaLSE;

import java.util.Scanner;

import AHHH.LSE;

public class Bee1062 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) break; // Condição de saída

            while (true) {
                LSE<Integer> pilha = new LSE<>(); // Pilha para verificar a ordem dos vagões
                boolean flag = true; // Flag para verificar se é possível ordenar os vagões
                int nextVagao = 1; // Próximo vagão a ser colocado na estação

                // Leitura dos vagões
                for (int i = 0; i < n; i++) {
                    int v = scanner.nextInt();

                    // Verifica se é possível ordenar os vagões na ordem desejada
                    while (pilha.getTamanho() == 0 || pilha.buscaPorPosicao(pilha.getTamanho() - 1) != v) {
                        if (nextVagao > n) {
                            // Se o próximo vagão a ser colocado na estação for maior que o número total de vagões,
                            // isso significa que não é possível ordenar os vagões na ordem desejada.
                            flag = false;
                            break;
                        }
                        pilha.adiciona(nextVagao++);
                    }

                    if (!flag) break; // Sai do loop se não for possível ordenar os vagões
                    pilha.removeFinal(); // Remove o vagão da estação
                }

                if (flag) {
                    System.out.println("Yes"); // Se for possível ordenar os vagões, imprime "Yes"
                } else {
                    System.out.println("No"); // Caso contrário, imprime "No"
                }

                int proximoN = scanner.nextInt();
                if (proximoN == 0) break; // Condição de saída para o caso de teste atual
                System.out.println(); // Imprime linha em branco entre casos de teste
                n = proximoN;
            }
        }
    }
}
