package Bee1011to1020;

import java.util.Locale;
import java.util.Scanner;

public class Bee1015{
	public static void main(String [] agrs) {
		Scanner s = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		float x1 = s.nextFloat();
		float y1 = s.nextFloat();
		float x2 = s.nextFloat();
		float y2 = s.nextFloat();
		
		float dist = (float) (Math.sqrt(((x1 - x2)*(x1 - x2)) + (y1 - y2)*(y1 - y2)));
		System.out.println(dist);
	}
}