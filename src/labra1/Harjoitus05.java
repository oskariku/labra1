// Ohjelma laskee käyttäjän antamien kolmen kokonaisluvun (int) keskiarvon muuttaen sen liukuluvuksi (double)
package labra1;

import java.util.Scanner;

/**
 *
 * @author vokuu
 */
public class Harjoitus05 {
    
    static Scanner lukija = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int luku1; int luku2; int luku3;
        double keskiarvo;
        
        
        System.out.println("Syötä kolme kokonaislukua ja ohjelma laskee niiden keskiarvon.");
        
        System.out.print("1. Luku: ");
            luku1 = lukija.nextInt();
        System.out.print("2. Luku: ");
            luku2 = lukija.nextInt();
        System.out.print("3. Luku: ");
            luku3 = lukija.nextInt();
        
            
           keskiarvo = (double)(luku1+luku2+luku3) / 3;
        System.out.println("Antamiesi lukujen keskiarvo on " + keskiarvo + ".");
    }
    
}
