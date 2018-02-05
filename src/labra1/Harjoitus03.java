// Ohjelma pyytää käyttäjältä kaksi sivun pituutta ja tulostaa niiden pinta-alan
package labra1;

import java.util.Scanner;


/**
 *
 * @author vokuu
 */
public class Harjoitus03 {
    
    static Scanner lukija = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        //muuttujat
        double SivuX;
        double SivuY;
        double PintaAla;
        
        
        System.out.println("Lasketaan pinta-ala. Syötä sivun X pituus: ");
        SivuX = lukija.nextDouble();
        
        System.out.println("Syötä seuraavaksi sivun Y pituus: ");
        SivuY = lukija.nextDouble();
        
       
        PintaAla = SivuX * SivuY;
        System.out.println("Antamasi alueen pinta-ala on " + PintaAla);
    }
    
}
