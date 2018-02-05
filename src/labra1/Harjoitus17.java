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
public class Harjoitus17 {
    
    static Scanner lukija = new Scanner(System.in);
    
    public static void main(String[] args) {
    
        int luku;
        
        System.out.print("Syötä jokin luku: ");
        luku = lukija.nextInt();   
        
        
        if (luku==0) {
            System.out.println("Nollaa ei voi jakaa millään luvulla!");
        } else {
            
        if (luku%2==0) {
            if (luku>10) {
                System.out.println("Luku on parillinen ja sen arvo on suurempi kuin 10.");
                
            } else {
                System.out.println("Luku on parillinen ja sen arvo on pienempi tai yhtäsuuri kuin 10.");
                
            }
            
        } else {
            if (luku<=10) {
            System.out.println("Luku on pariton ja se on pienempi tai yhtä suuri kuin 10.");
            } else {
                System.out.println("Luku on pariton ja se on suurempi kuin 10.");
                
            }
        }
        
    }
    }
}
