package EstruturaDeDados;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> valores = new ArrayList<>();
        
        // Lendo os valores
        for (int i = 0; i < 3; i++) {
            valores.add(scanner.nextInt());
        }
        
        // Ordenando usando merge sort recursivo
        mergeSort(valores, 0, valores.size() - 1);
        
        // Imprimindo em ordem crescente
        for (int valor : valores) {
            System.out.println(valor);
        }
        
        // Imprimindo a linha em branco
        System.out.println();
        
        // Imprimindo como foram lidos
        for (int valor : valores) {
            System.out.println(valor);
        }
    }

    private static void mergeSort(ArrayList<Integer> arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    private static void merge(ArrayList<Integer> arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        ArrayList<Integer> L = new ArrayList<>();
        ArrayList<Integer> R = new ArrayList<>();

        for (int i = 0; i < n1; ++i) {
            L.add(arr.get(l + i));
        }
        for (int j = 0; j < n2; ++j) {
            R.add(arr.get(m + 1 + j));
        }

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L.get(i) <= R.get(j)) {
                arr.set(k, L.get(i));
                i++;
            } else {
                arr.set(k, R.get(j));
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr.set(k, L.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            arr.set(k, R.get(j));
            j++;
            k++;
        }
    }
}
