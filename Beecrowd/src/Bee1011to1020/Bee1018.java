package Bee1011to1020;

import java.util.Locale;
import java.util.Scanner;

public class Bee1018{
	public static void main(String [] agrs) {
		Scanner s = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int dindin = s.nextInt();
		
		
		int nota100= dindin/100;  
		System.out.println(nota100); 
		
		int resto = dindin % 100;
		int nota50 = resto / 50;
		System.out.println(nota50);

		resto = resto % 50;
		int nota20 = resto / 20;		
		System.out.println(nota20);
		
		resto = resto % 20;
		int nota10= resto/10;
		System.out.println(nota10);
		
		resto = resto % 10;
		int nota5 = resto/5;
		System.out.println(nota5);
		
		resto= resto % 5;
		int nota2= resto/2;
		System.out.println(nota2);

	}
}