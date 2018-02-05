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
public class Harjoitus19b {
    
    static Scanner lukija = new Scanner(System.in);
    
    public static void main(String[] args) {
    
        int luku;
        
        System.out.print("Syötä jokin kokonaisluku: ");
        luku = lukija.nextInt();
        
        while (luku%5!=0) {
            luku++;

        }
                System.out.println("Uusi luku on " + luku);
    }
    
}
