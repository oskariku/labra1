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
public class Harjoitus14 {
    
    static Scanner lukija = new Scanner(System.in);
    
    public static void main(String[] args) {
    
        int arvosanaNumero;
        String arvosana;
        
        System.out.print("Syötä saamasi arvosana: ");
        arvosanaNumero = lukija.nextInt();
        
        
        switch (arvosanaNumero) {
            
            case 0:
                arvosana = "hylätty";
                System.out.println("Arvosanasi on " + arvosana + ".");
                break;
            case 1:
                arvosana = "välttävä";
                System.out.println("Arvosanasi on " + arvosana + ".");
                break;
            case 2:
                arvosana = "tyydyttävä";
                System.out.println("Arvosanasi on " + arvosana + ".");
                break;
            case 3:
                arvosana = "hyvä";
                System.out.println("Arvosanasi on " + arvosana + ".");
                break;
            case 4:
                arvosana = "kiitettävä";
                System.out.println("Arvosanasi on " + arvosana + ".");
                break;
            case 5:
                arvosana = "erinomainen";
                System.out.println("Arvosanasi on " + arvosana + ".");
                break;
                
            default:
                System.out.println("Syöttämäsi arvosana oli virheellinen");  
        }
        
    
    }
    
}
