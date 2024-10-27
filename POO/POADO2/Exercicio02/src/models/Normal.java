/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author kaiqu
 */
public class Normal extends Ingresso{
    
    public Normal(double valor) {
        super(valor);
    }
    
    public void exibirTipo(){
        System.out.println("Ingresso Normal!");
    }
}
