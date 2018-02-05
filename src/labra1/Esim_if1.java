// IF-lauserakenteen harjoitus

package labra1;

import java.util.Scanner;

/**
 *
 * @author vokuu
 */
public class Esim_if1 {
    
    static Scanner lukija = new Scanner(System.in);
    
    public static void main(String[] args) {
    
    double arvo; // käyttäjän antama luku
    
    System.out.print("Syötä luku: ");
    arvo = lukija.nextDouble();
    
    System.out.println("if-testi: oliko luku alle 10?");
    
    if (arvo<10) {
        System.out.println("Luku oli alle kymmenen.");
    }   else if (arvo==10) {
            System.out.println("Lukusi oli tasan kymmenen.");
    }       else {
                System.out.println("Lukusi oli yli kymmenen.");
    
    }
    
    System.out.println("-- if-testi suoritettu --");
    
    }
    
}
