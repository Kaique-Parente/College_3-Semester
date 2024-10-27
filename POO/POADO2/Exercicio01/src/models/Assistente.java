package models;

/**
 *
 * @author kaiqu
 */
public class Assistente extends Funcionario{
    private int numeroMatricula;

    public Assistente(int numeroMatricula, String nome, double salario) {
        super(nome, salario);
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
    
    @Override
    public void exibeDados(){
        System.out.println("Nome: " + getNome() + "\nSalario: " + getSalario() + "\nNúmero Matrícula: " + numeroMatricula);
    }
}

