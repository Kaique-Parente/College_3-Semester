package models;

/**
 *
 * @author kaiqu
 */
public class CamaroteSuperior extends VIP{

    public CamaroteSuperior(double valor, double valorAdicional) {
        super(valor, valorAdicional);
    }
    
    public void exibirValor(){
        System.out.println("Valor: " + getValor() + "\nValor Adicional: " + getValorAdicional() + "\nTotal: " + (getValor()+getValorAdicional()));
    }
}
