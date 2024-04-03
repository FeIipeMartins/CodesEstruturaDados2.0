package Bee1011to1020;

import java.util.Locale;
import java.util.Scanner;


public class Bee1013{
	public static void main (String[]agrs) {
	Scanner s= new Scanner(System.in);
	Locale.setDefault(Locale.US);
	int a = s.nextInt();
	int b = s.nextInt();
	int c = s.nextInt();
	
	
	int MaiorAB = (a + b + Math.abs(a-b))/2;
	int TesteC = ( MaiorAB + c + Math.abs(MaiorAB-c))/2;
	
	System.out.println(TesteC + " eh o maior");
	}         
}