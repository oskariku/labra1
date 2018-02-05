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
public class Harjoitus15 {
    static Scanner lukija = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int ekaLuku, tokaLuku;
        
        System.out.println("Syötä kaksi kokonaislukua.");
            System.out.print("Ensimmäinen luku: ");
            ekaLuku = lukija.nextInt();
            System.out.print("Toinen luku: ");
            tokaLuku = lukija.nextInt();
            
            if (ekaLuku==tokaLuku) {
            
                System.out.println("Luvut ovat yhtä suuria.");
            } else if (ekaLuku>tokaLuku) {
            
                System.out.println("Ensimmäinen luku on suurempi kuin toinen.");
            } else {
            
                System.out.println("Toinen luku on suurempi kuin ensimmäinen.");
            }

}
    
}
