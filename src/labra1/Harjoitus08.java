// Ohjelma kysyy ympyrän säteen ja laskee ympyrän pinta-alan sekä kehän pituuden
//
package labra1;

import java.util.Scanner;

/**
 *
 * @author vokuu
 */
public class Harjoitus08 {
    
    static Scanner lukija = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        
        double sade, ala, keha, halkaisija;
        
        
        System.out.print("Syötä ympyrän säde: ");
        sade = lukija.nextDouble();
        
        ala = ((Math.PI) * Math.pow(sade, 2));
        
        System.out.println("Ympyrän pinta-ala A on: " + ala);
        
        
        keha = (2 * Math.PI) * sade;
        System.out.println("Ympyrän kehän pituus on " + keha);
    }
    
}