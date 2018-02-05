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
public class Harjoitus04 {
    
    static Scanner lukija = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int KoneenLuku;
        int KayttajanLuku;
        
        System.out.println("Let's play a game.");
        System.out.print("Yritä arvata, mitä lukua ajattelen. ");
        KayttajanLuku = lukija.nextInt();
        
        KoneenLuku = KayttajanLuku + 1;
        System.out.println("Väärin arvattu! Minun lukuni oli " + KoneenLuku + "!");
    }
    
}
