package Bee1000to1010;

import java.util.Scanner;

public class Bee1007{
	public static void main(String []agrs) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		int D = s.nextInt();
		int Dif;
		Dif = (A * B) - (C * D);
		System.out.println("DIFERENCA = " + Dif);
	}
}