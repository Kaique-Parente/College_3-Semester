package application;

import models.CamaroteSuperior;
import models.Normal;
import models.VIP;

/**
 *
 * @author kaiqu
 */
public class Program {
    public static void main(String[] args) {
        VIP v = new VIP(200, 10);
        
        System.out.println(v.retornaValorTotal());
        Normal n = new Normal(300);
        
        n.exibirTipo();
        
        CamaroteSuperior cs = new CamaroteSuperior(200, 100);
        
        cs.exibirValor();
    }
}
