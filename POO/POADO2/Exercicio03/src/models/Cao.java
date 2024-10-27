package models;

/**
 *
 * @author kaiqu
 */
public class Cao extends Animal{
    private double peso;

    public Cao(int idade, String nome, double peso) {
        super(nome, idade);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void ladrar(){
        if(!getNome().equals("")){
            System.out.println("O(a) " + getNome() + " está ladrando!");
        } else {                        
            System.out.println("O cachorro está ladrando!");
        }
    }
}
