package models;

/**
 *
 * @author kaiqu
 */
public class Animal {
    private String nome;
    private int idade;

    public Animal(int idade) {
        this.nome = "";
        this.idade = idade;
    }

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void dormir(){
        if(!nome.equals("")){
            System.out.println("O(a) " + nome + " está dormindo!");
        } else {                        
            System.out.println("O animal está dormindo!");
        }
    }
}
