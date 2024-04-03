package Bee1011to1020;

import java.util.Locale;
import java.util.Scanner;

public class Bee1016{
	public static void main(String [] agrs) {
		Scanner s = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int km = s.nextInt();
		int Tempo = km * 2; 
		System.out.println(Tempo + " minutos" );
	}
}