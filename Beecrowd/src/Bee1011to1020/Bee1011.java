package Bee1011to1020;

import java.util.Locale;
import java.util.Scanner;

public class Bee1011{
public static void main (String [] agrs){
	Scanner s = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	double pi = 3.14159;
	double R = s.nextDouble();
	double volume = ((4/3.0) * pi) * (R*R*R);
	System.out.printf("VOLUME = " + volume);
	}
}