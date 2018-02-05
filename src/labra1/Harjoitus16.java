// vertaillaan, kumpi annettu merkkijono on aakkosissa aikaisemmin
package labra1;

import java.util.Scanner;

/**
 *
 * @author vokuu
 */
public class Harjoitus16 {
    
    static Scanner lukija = new Scanner(System.in);
    
    public static void main(String[] args) {
    
        String eka, toka;
        int tulos;
        
        System.out.println("Syötä kaksi merkkijonoa.");
            System.out.print("Ensimmäinen: ");
            eka = lukija.next();
            System.out.print("Toinen: ");
            toka = lukija.next();
            
            tulos = eka.compareToIgnoreCase(toka);
            
            if (tulos==0) {
                System.out.println(eka + " ja " + toka + " ovat aakkosissa samassa kohtaa.");
                
            } else if (tulos<0) {
                System.out.println(eka + " on aakkosissa ennen kuin " + toka);
                
            } else {
                System.out.println(toka + " on aakkosissa ennen kuin " + eka);
                
            }
        
    }
    
}
