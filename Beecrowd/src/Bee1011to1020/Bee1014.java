package Bee1011to1020;

import java.util.Locale;
import java.util.Scanner;

public class Bee1014{
	public static void  main(String[]agrs) {
		Scanner s =new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double x = s.nextDouble();
		double y = s.nextDouble();
		double dist = x/y;
		System.out.printf( dist + " km/");
	}
}