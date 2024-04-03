package ExerceciosListaLSE;

import AHHH.LSE;

public class ExercioTamanho {
    public static void main(String[] args) {
        // Criando uma lista encadeada de inteiros
        LSE<Integer> lista = new LSE<>();
        
        // Adicionando alguns elementos à lista
        lista.adiciona(10);
        lista.adiciona(20);
        lista.adiciona(30);
        lista.adiciona(40);
        lista.adiciona(50);

        // Testando a função de contagem de elementos
        int numeroElementos = lista.contarElementos(lista);
        System.out.println("Número de elementos na lista: " + numeroElementos);
    }
  }