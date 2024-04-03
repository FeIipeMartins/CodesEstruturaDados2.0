package Bee1000to1010;

import java.util.Scanner;
import java.util.Locale;

public class Bee1006 {
    public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    Locale.setDefault(Locale.US);
    double Media;
    double A = s.nextDouble();
    double B = s.nextDouble();
    double C = s.nextDouble();
    Media = ((A * 2) + (B * 3) + (C * 5)) / 10.0;
    System.out.println("MEDIA = " + String.format("%.1f", Media));
    
    }
}