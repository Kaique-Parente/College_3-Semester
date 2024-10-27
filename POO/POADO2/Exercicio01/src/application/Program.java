package application;

import models.Administrativo;
import models.Assistente;
import models.Funcionario;

/**
 *
 * @author kaiqu
 */
public class Program {
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario("Kaka", 1200d);
        f1.exibeDados();
        
        Assistente as = new Assistente(321, "Lapa", 1100d);
        as.exibeDados();
        
        
        Administrativo ad = new Administrativo(1111, "Rapap", 1200d, "dia", 100);
        ad.exibeDados();
    }
}
