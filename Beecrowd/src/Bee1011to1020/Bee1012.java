package Bee1011to1020;

import java.util.Locale;
import java.util.Scanner;

public class Bee1012{
	public static void main (String[]agrs) {
	 Scanner s = new Scanner(System.in);
	 Locale.setDefault(Locale.US);
	 
	 double a = s.nextDouble();
	 double b = s.nextDouble();
	 double c = s.nextDouble();
	 double pi = 3.14159;
	 
	 double TRIANGULO = a*c/2;
	 double CIRCULO = (c*c)* pi;
	 double TRAPEZIO = ((a + b) *c)/2;
	 double QUADRADO = b*b;
	 double RETANGULO = a*b;

	 System.out.println("TRIANGULO:" + TRIANGULO );
	 System.out.println("CIRCULO:" + CIRCULO);
	 System.out.println("TRAPEZIO:" + TRAPEZIO);
	 System.out.println("QUADRADO:" + QUADRADO);
	 System.out.println("RETANGULO:" + RETANGULO);


	 
	}
}