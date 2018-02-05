// onko vuosi karkausvuosi
package labra1;

import java.util.Scanner;

/**
 *
 * @author vokuu
 */
public class Harjoitus20 {
    
    static Scanner lukija = new Scanner(System.in);
    
    public static void main(String[] args) {
    
        int vuosi;
        
        System.out.print("Syötä vuosiluku: ");
        vuosi = lukija.nextInt();
        
        if (vuosi%4==0 && vuosi%100==0 && vuosi%400==0) {
            System.out.println("Vuosi " + vuosi + " on karkausvuosi.");
        } else {
            System.out.println("Vuosi " + vuosi + " ei ole karkausvuosi.");
        }
        
    }
}

