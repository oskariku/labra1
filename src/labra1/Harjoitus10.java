// Annetaan kulman kosini, ohjelma laskee kulman asteina / radiaaneina
//kosini A = b/c eli viereinen sivu jaettuna hypotenuusalla
package labra1;

import java.util.Scanner;

/**
 *
 * @author vokuu
 */
public class Harjoitus10 {
    
    static Scanner lukija = new Scanner(System.in);
    
    public static void main(String[] args) {
    
    double kosini, asteet, radiaanit;
    
    System.out.print("Syötä kulman kosini: ");
    kosini = lukija.nextDouble();
    
    Math.acos(kosini);
    
        asteet = Math.toDegrees(Math.acos(kosini));
        System.out.println("Kulman suuruus asteina on " + asteet);

        radiaanit = Math.toRadians(Math.acos(kosini));
        System.out.println("Kulman suuruus radiaaneina on " + radiaanit);
        
    }
    
}
