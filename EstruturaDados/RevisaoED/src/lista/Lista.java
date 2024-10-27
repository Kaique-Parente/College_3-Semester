/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

import models.entities.Cliente;

/**
 *
 * @author kaiqu
 */
public class Lista {
    No inicio, atual, aux;
    private static Cliente[] lista = new Cliente[3];
    
    public Lista(){}
    
    public void inserir(Object object){
        if(inicio == null){
            inicio = new No(object, null);
            aux = inicio;
        } else {
            atual = new No(object, null);
            aux.setProxNo(atual);
            aux = atual;
        }
    }
    
    public boolean verificar(){
        return inicio==null;
    }
    
    public void exibir(){
        No ref = inicio;
        
        while(ref!=null){
            System.out.println(ref.getObject());
            ref = ref.getProxNo();
        }
    }
    
    public Cliente[] alocarNovoArray(){
        Cliente[] novoArray = new Cliente[lista.length+3];
        
        System.arraycopy(lista, 0, novoArray, 0, lista.length);
        return novoArray; 
    }
}
