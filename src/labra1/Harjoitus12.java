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
public class Harjoitus12 {
    
    static Scanner lukija = new Scanner(System.in);
    
    public static void main(String[] args) {
    
    double kalorit, joulet;
    int valinta;
    
    System.out.println("Haluatko muuttaa kalorit jouleiksi, vai joulet kaloreiksi?");
    System.out.println("Kalorit jouleiksi: paina 1. Joulet kaloreiksi, paina 2.");
    valinta = lukija.nextInt();
    
    if (valinta==1) {
        System.out.print("Syötä kalorien määrä: ");
        kalorit = lukija.nextDouble();
            joulet = kalorit * 4.184;
                System.out.println(kalorit + " kaloria on " + joulet + " joulea.");
    } else if (valinta==2) {
        System.out.print("Syötä joulejen määrä: ");
        joulet = lukija.nextDouble();
            kalorit = joulet * 0.2390;
                System.out.println(joulet + " joulea on " + kalorit + " kaloria.");
    } else {
        System.out.println("Valintasi oli virheellinen.");
    }
    
    }

}
