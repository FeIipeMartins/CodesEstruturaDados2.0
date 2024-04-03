package Bee1011to1020;

import java.util.Locale;
import java.util.Scanner;

public class Bee1017{
	public static void main(String [] agrs) {
		Scanner s = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int hrs =s.nextInt();
		int kms= s.nextInt();
		double dist = kms*hrs;
		int consumo = 12;
		
		double consumoEsperdo=  dist/consumo;
		
		System.out.println(consumoEsperdo);
		
	
	}
}