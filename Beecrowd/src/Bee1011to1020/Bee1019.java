package Bee1011to1020;

import java.util.Locale;
import java.util.Scanner;

public class Bee1019{
	public static void main(String [] agrs) {
		Scanner s = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int tempo = s.nextInt();
		
		int hrs = tempo /3600;
		int resto = tempo % 3600;	
		
		int min = tempo/60;
		 resto = resto % 60;
	
		int seg = resto % 60;
		
		 System.out.println(hrs + ":" + min + ":"+ seg );
				
	}
}