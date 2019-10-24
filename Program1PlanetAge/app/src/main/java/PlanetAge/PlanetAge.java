package PlanetAge;

import java.util.Scanner;
public class PlanetAge {

  public static void main(String[] args) {
    
    double Seconds,EDays, EYears;

    Scanner myObj = new Scanner(System.in);
    
    System.out.println("|==========================================|");
    System.out.println("|                AGE IN SECONDS            |");
    System.out.println("|==========================================|");
    System.out.print("Enter Seconds: ");
    Seconds = myObj.nextDouble();
    
    
    EDays = Seconds/86400.0;
    EYears = EDays/365.25;
    
    System.out.println("Earth:  OrPe:  " + EYears + " EYears  ");
        System.out.println("Mercury: OrPe:  " + EYears* 0.2408486 + " EYears");
        System.out.println("Venus: OrPe:  " + EYears* 0.61519726 + " EYears");
        System.out.println("Mars: OrPe:  " + EYears* 1.8808158 + " EYears");
        System.out.println("Jupiter: OrPe:  " + EYears* 11.862615 + " EYears");
        System.out.println("Staturn: OrPe:  " + EYears* 29.447498 + " EYears");
        System.out.println("Uranus: OrPe:  " + EYears* 84.016846 + " EYears");
        System.out.println("Neptune: OrPe:  " + EYears* 164.79132 + " EYears");
       
       System.out.println("|==========================================|"); 
       
       
    }
}

