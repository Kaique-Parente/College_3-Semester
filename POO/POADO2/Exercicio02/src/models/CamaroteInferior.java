package models;

/**
 *
 * @author kaiqu
 */
public class CamaroteInferior extends VIP{
    private String localizacao;

    public CamaroteInferior(double valor, double valorAdicional, String localizacao) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void exibirLocalizacao(){
        System.out.println("Localização: " + localizacao);
    }
}
