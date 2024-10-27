/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.entities;

/**
 *
 * @author kaiqu
 */
public class Cliente {
    private String nome;
    private int telefone;
    private int id;
    private static int valor = 1;
    
    public Cliente(String nome, int telefone){
        id = valor++;
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getTelefone(){
        return telefone;
    }
    
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString(){
        return id + " " + nome + " " + telefone;
    }
}
