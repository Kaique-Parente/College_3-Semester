package models;

/**
 *
 * @author kaiqu
 */
public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario() {}

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void addAumento(double valor){
        salario += valor;
    }
    
    public double ganhoAnual(){
        return salario*12;
    }
    
    public void exibeDados(){
        System.out.println("Nome: " + nome + "\nSalario: " + salario);
    }
}
