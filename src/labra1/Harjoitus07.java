// Ohjelma arpoo kateettien pituudet ja laskee hypotenuusan pituuden.

package labra1;

// Ei tarvita java.util.Scanneria koska käyttäjältä ei kysytä mitään.
/**
 *
 * @author vokuu
 */
public class Harjoitus07 {
    
    
    public static void main(String[] args) {
        
        double katA, katB, hypotenuusa;
        
        
        //arvotaan mitat välille 5... 8
        katA = 5 + Math.random() * 3;
        katB = 5 + Math.random() * 3;
        
        System.out.println("Kateetti A pituus: " + katA);
        System.out.println("Kateetti B pituus: " + katB);
        
        hypotenuusa = Math.hypot(katA, katB);
        
        System.out.printf("Hypotenuusan pituus: %.2f \n", hypotenuusa);
        
    }
    
}
