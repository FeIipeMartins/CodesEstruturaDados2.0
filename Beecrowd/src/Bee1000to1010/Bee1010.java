package Bee1000to1010;

import java.util.Locale;
import java.util.Scanner;

public class Bee1010{
	public static void main (String [] agrs) {
		Scanner s =new Scanner(System.in);
		Locale.setDefault(Locale.US);
		String nunp1 = s.next() ;
		int quatp1 = s.nextInt();
		double valp1 = s.nextDouble();
		String nunp2 = s.next() ;
		int quatp2 = s.nextInt();
		double valp2 = s.nextDouble();
		double x = (quatp1 * valp1)+ (quatp2 * valp2);
		System.out.printf("VALOR A PAGAR: R$ " + String.format("%.2f%n", x));
		
	}
}