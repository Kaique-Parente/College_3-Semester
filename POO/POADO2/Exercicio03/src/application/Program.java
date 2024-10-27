package application;

import models.Animal;
import models.Cao;
import models.Gato;

/**
 *
 * @author kaiqu
 */
public class Program {
    public static void main(String[] args) {
        Animal a1 = new Animal(3);
        a1.dormir();
        
        Cao c1 = new Cao(1, "", 10.2);
        c1.ladrar();
        
        Gato g1 = new Gato(2, "Wallace", 7);
        
        g1.subirArvore();
    }
}
