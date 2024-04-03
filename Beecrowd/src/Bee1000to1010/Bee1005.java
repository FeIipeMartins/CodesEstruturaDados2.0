package Bee1000to1010;

import java.util.Scanner;
import java.util.Locale;

public class Bee1005 {
    public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    Locale.setDefault(Locale.US);
    double Media;
    double A = s.nextDouble();
    double B = s.nextDouble();
    Media = ((A * 3.5) + (B * 7.5) ) / 11.0;
    System.out.println("MEDIA = " + String.format("%.5f", Media));
    
    }
}