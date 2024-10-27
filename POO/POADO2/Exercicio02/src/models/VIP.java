package models;

/**
 *
 * @author kaiqu
 */
public class VIP extends Ingresso{
    private double valorAdicional;

    public VIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
    public double retornaValorTotal(){
        return super.getValor() + valorAdicional;
    }
    
}
