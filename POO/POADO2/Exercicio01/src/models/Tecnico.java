package models;

/**
 *
 * @author kaiqu
 */
public class Tecnico extends Assistente{
    private double bonusSalarial;

    public Tecnico(int numeroMatricula, String nome, double salario, double bonusSalarial) {
        super(numeroMatricula, nome, salario);
        this.bonusSalarial = bonusSalarial;
    }

    public double getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(double bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public double ganhoAnual(){
        return (getSalario() + bonusSalarial) * 12;
    }
    
    @Override
    public void exibeDados(){
        System.out.println("Nome: " + getNome() + "\nSalario: " + getSalario() + "\nNúmero Matrícula: " + getNumeroMatricula() 
                +"\nBonus Salarial: " + bonusSalarial);
    }
    
}
