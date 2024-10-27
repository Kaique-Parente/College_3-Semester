package models;

/**
 *
 * @author kaiqu
 */
public class Gato extends Animal{
    private int numeroDeVidas;

    public Gato(int idade, String nome, int numeroDeVidas) {
        super(nome, idade);
        this.numeroDeVidas = numeroDeVidas;
    }

    public int getNumeroDeVidas() {
        return numeroDeVidas;
    }

    public void setNumeroDeVidas(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
    }
    
    public void subirArvore(){
        if(!getNome().equals("")){
            System.out.println("O(a) " + getNome() + " est� subindo na �rvore!");
        } else {                        
            System.out.println("O gato est� subindo na �rvore!");
        }
    }
    
}
