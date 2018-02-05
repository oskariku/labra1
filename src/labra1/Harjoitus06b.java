// Ohjelma laskee hypotenuusan pituuden
// A^2 + B^2 = C^2
package labra1;

import java.util.Scanner;

/**
 *
 * @author vokuu
 */
public class Harjoitus06b {
    static Scanner lukija = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        // Kysytään käyttäjältä kateettien pituudet:
        
        double sivuA, sivuB, hypotenuusa;
        System.out.println("Lasketaan hypoteuusan pituus.");
        System.out.print("Syötä sivun A pituus: ");
        sivuA = lukija.nextDouble();
        System.out.print("Syötä Sivun B pituus: ");
        sivuB = lukija.nextDouble();
        
        // Ohjelma tekee laskutoimituksen:
        
        hypotenuusa = Math.hypot(sivuA, sivuB);
        System.out.print("Hypotenuusan pituus on: " + hypotenuusa);
    
    }
    
}
