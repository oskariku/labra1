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
public class Harjoitus13 {
    static Scanner lukija = new Scanner(System.in);
    
    public static void main(String[] args) {
    
        double tuotteenHinta, rahaaLompakossa, rahaaJaljella;
        
        System.out.println("Montako euroa maksaa lihapiirakka?");
        System.out.print("Hinta: ");
        tuotteenHinta = lukija.nextDouble();
        
        System.out.print("Paljonko lompakossa on rahaa? ");
        rahaaLompakossa = lukija.nextDouble();
        rahaaJaljella = rahaaLompakossa - tuotteenHinta;
        
        if (tuotteenHinta > rahaaLompakossa) {
        
            System.out.println("Sinulla ei ole varaa lihapiirakkaan.");
            
        } else if (tuotteenHinta == rahaaLompakossa) {
            System.out.println("Sinulla oli juuri ja juuri varaa lihapiirakkaan.");
            System.out.println("Sinulle jäi rahaa " + rahaaJaljella + " euroa");
            
        } else {
        
            System.out.println("Tässä lihis, ole hyvä.");
            System.out.println("Sinulle jäi rahaa jäljelle " + rahaaJaljella + " euroa.");
        }
    
    }
    
}
