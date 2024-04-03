package Bee1000to1010;

import java.util.Scanner;

public class Bee1002{
	public static void main (String [ ]agrs) {
		Scanner s = new Scanner(System.in);
		double N = 3.14159;
		double Raio = s.nextDouble();
		double Area = N * (Raio*Raio); 
        System.out.printf("A=%.4f%n", Area);
	}
}