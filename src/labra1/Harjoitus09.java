// Syötetään kulman suuruus asteina, ohjelma laskee kulman sinin
//
package labra1;

import java.util.Scanner;

/**
 *
 * @author vokuu
 */
public class Harjoitus09 {
    
    static Scanner lukija = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        double kulmaAsteet, kulmaRad, sin;
        
        
        System.out.print("Syötä kulman suuruus asteina: ");
        kulmaAsteet = lukija.nextDouble();
        
        kulmaRad = Math.toRadians(kulmaAsteet);
        sin = Math.sin(kulmaRad);
        
        System.out.println("Kulman Sin-arvo on " + sin);
        
        
        
        
    }
    
}
