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
public class Harjoitus11 {
    
    static Scanner lukija = new Scanner(System.in);
    
    public static void main(String[] args) {
    
    int lukuA, lukuB;
    
    System.out.println("Syötä kaksi lukua. Ohjelma tarkistaa, onko ensimmäinen luku jaollinen toisella.");
    
    System.out.print("Anna ensimmäinen luku: ");
    lukuA = lukija.nextInt();
    System.out.print("Anna toinen luku: ");
    lukuB = lukija.nextInt();
    
    if (lukuA%lukuB==0) {
        
        System.out.println("Ensimmäinen luku " + lukuA + " on jaollinen toisella luvulla" + lukuB + ".");
    
    } else {
        System.out.println("Antamasi ensimmäinen luku ei ole jaollinen toisella antamallasi luvulla.");
    
    }
    
    
    
    }
    
}
