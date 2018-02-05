/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labra1;

import java.util.Scanner;

/**
 *
 * @author vokuu
 */
public class Harjoitus19 {
    
    static Scanner lukija = new Scanner(System.in);
    
    public static void main(String[] args) {
    
        int luku, uusiLuku;
        
        System.out.print("Syötä jokin kokonaisluku: ");
        luku = lukija.nextInt();
        
        // tulostetaan käyttäjän antamaa lukua suurempi seuraava viidellä jaollinen luku.
        
        for (int i = 0; i < 5; i++) {
            
            luku++;
            if (luku%5==0) {
                   System.out.println(luku);
            }
            
        }
        
    }
    
}
