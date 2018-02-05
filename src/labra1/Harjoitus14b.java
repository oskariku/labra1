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
public class Harjoitus14b {
    
    static Scanner lukija = new Scanner(System.in);
    
    public static void main(String[] args) {
    
        int arvosanaNumero;
        String arvosana = null;
        
        System.out.print("Syötä saamasi arvosana: ");
        arvosanaNumero = lukija.nextInt();
        
        
        switch (arvosanaNumero) {
            
            case 0:
                arvosana = "hylätty";
                break;
            case 1:
                arvosana = "välttävä";
                break;
            case 2:
                arvosana = "tyydyttävä";
                break;
            case 3:
                arvosana = "hyvä";
                break;
            case 4:
                arvosana = "kiitettävä";
                break;
            case 5:
                arvosana = "erinomainen";
                break;
                
                
            default:
                System.out.println("Väärin.");
    
    }
        
        System.out.println("Arvosanasi on " + arvosana);
    
}
}