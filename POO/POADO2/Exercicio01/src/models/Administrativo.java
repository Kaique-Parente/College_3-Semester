/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author kaiqu
 */
public class Administrativo extends Assistente{
    private String turno;
    private double adicionalNoturno;

    public Administrativo(int numeroMatricula, String nome, double salario, String turno, double adicionalNoturno) {
        super(numeroMatricula, nome, salario);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }
    
    @Override
    public double ganhoAnual(){
        if(turno.equalsIgnoreCase("noite")){
            return (getSalario() + adicionalNoturno) * 12;
        }
        return getSalario() * 12;
    }
    
    @Override
    public void exibeDados(){
        System.out.println("Nome: " + getNome() + "\nSalario: " + getSalario() + "\nNúmero Matrícula: " + getNumeroMatricula() 
                +"\nTurno: " + turno + "\nAdicional Noturno: " + adicionalNoturno);
    }
}
