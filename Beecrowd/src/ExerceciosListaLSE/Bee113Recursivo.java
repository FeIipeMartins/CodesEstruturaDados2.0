package ExerceciosListaLSE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bee113Recursivo {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        	rec(sc, list);
        	sc.close();
	}
	static void rec(Scanner sc, List<Integer> list) {
		int nume1 = sc.nextInt();
		int nume2 = sc.nextInt();
		
		if(nume1<nume2) {
            list.add(nume1);
			list.add(nume2);
			System.out.println("Crescente");
		}
		else if (nume1 == nume2) {
			list.add(nume1);
			list.add(nume2);
			return;
		}
		else {
			list.add(nume2);
			list.add(nume1);
			System.out.println("Decrescente");
		}
		rec(sc,list);	
		}	
}