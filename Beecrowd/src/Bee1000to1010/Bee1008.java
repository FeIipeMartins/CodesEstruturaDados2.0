package Bee1000to1010;

import java.util.Locale;
import java.util.Scanner;

public class Bee1008{
	public static void main(String []agrs){
		Scanner s =new Scanner (System.in);
	    Locale.setDefault(Locale.UK);
		int nun = s.nextInt();
		int horas = s.nextInt();
		double salary= s.nextDouble();
		double x;
		System.out.println("NUMBER = " + nun);
		x = horas * salary;
		System.out.printf("SALARY = U$ " + String.format("%.2f%n", x));
		

	}
}