/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import lista.Lista;
import models.entities.Cliente;

/**
 *
 * @author kaiqu
 */
public class Program {
    public static void main(String[] args){
        Lista lista = new Lista();
        
        System.out.println(lista.verificar());
        
        Cliente c1 = new Cliente("Kaka", 123123);
        Cliente c2 = new Cliente("Tata", 3232);
        
        lista.inserir(c1);
        lista.inserir(c2);
        lista.exibir();
    }
}
