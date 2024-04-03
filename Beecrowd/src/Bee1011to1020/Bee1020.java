package Bee1011to1020;

import java.util.Locale;
import java.util.Scanner;

public class Bee1020{
	public static void main(String [] agrs) {
		Scanner s = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int tempo = s.nextInt();
		
		int ano = tempo /365;
		int resto  = tempo % 365;
		
		System.out.println(ano + " ano(s)");
		
		int mes = resto/30;
		System.out.println(mes + " mes(S)");
		
		int dias = resto % 30;
		System.out.println(dias + " dia(S)");
		
		
	}
}