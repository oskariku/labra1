/*
 * Ohjelma kysyy nimen, ottaa sen vastaan ja tervehtii käyttäjää
 */
package labra1;

import java.util.Scanner;

/**
 *
 * @author vokuu
 */
public class Harjoitus02 {
    
    //luodaan lukija käyttäkän syötteitä varten
    static Scanner lukija = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        //esitellään käytettävä muuttuja (nimi)
        //määritellään sen tyypiksi String (merkkijono)
        
        String nimi;
        
        System.out.println("Anna nimesi: ");
        //pyydetään ja luetaan käyttäjältä nimi
        //ja sijoitetaan se muuttujaan "nimi".
        nimi = lukija.next();
        
        //tervehditään käyttäjää
        
        System.out.println("Hei " + nimi + ". Tervetuloa!");
        
        
        
    }
            
    
}
