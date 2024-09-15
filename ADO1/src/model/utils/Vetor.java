/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.utils;

import model.entities.Cliente;

/**
 *
 * @author kaiqu
 */
public class Vetor {
    private static Cliente[] lista = new Cliente[5];
    private static int indice = 0;

    /**
     * Cadastrar no array objetos do tipo Cliente
     *
     * @param cliente Cliente
     */
    public static void inserir(Cliente cliente) {
        if (indice == lista.length) {
            //Alocar um novo array com tamanho maior
            lista = alocarNovoArray();
        }

        lista[indice++] = cliente;
    }
    
     /**
     * Remove uma cliente do meu array pelo id
     *
     * @param id int
     * @return boolean
     */
    public static boolean remover(int id) {
        int indRem = pesquisar(id);
        if (indRem >= 0) {
            for (int i = indRem; i < indice - 1; i++) {
                lista[i] = lista[i + 1];
            }
            indice--;
            return true;
        }
        return false;
    }
    
    /**
     * Realiza a pesuisa linear no array e retorna o índice
     *
     * @param id int
     * @return int
     */
    private static int pesquisar(int id) {
        for (int i = 0; i < indice; i++) {
            if (id == lista[i].getId()) {
                return i;
            }
        }
        return -1;
    }
    
     /**
     * Realiza a pesuisa linear no array e retorna a instância
     *
     * @param id int
     * @return Cliente
     */
    public static Cliente pesquisarCadastro(int id) {
        for (int i = 0; i < indice; i++) {
            if (id == lista[i].getId()) {
                return lista[i];
            }
        }
        return null;
    }
    
    /**
     * Alocar um novo Array quando o principal exceder o seu tamanho
     * @return Cliente[]
     */
    private static Cliente[] alocarNovoArray() {
        Cliente[] novo = new Cliente[lista.length + (lista.length/2)];

        System.arraycopy(lista, 0, novo, 0, lista.length);

        return novo;
    }
    
    /**
     * Busca Binaria pelo nome do Cliente e retornar a instância
     * @param p
     * @return Cliente
     */
    public static Cliente buscaBinaria(Cliente p) {
        int inicio = 0, meio, fim;
        fim = lista.length - 1;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (lista[meio].getNome().equals(p.getNome())) {
                return p;
            } else if ((lista[meio].getNome().compareTo(p.getNome()) < 0)) {
                inicio = meio + 1;
            } else if ((lista[meio].getNome().compareTo(p.getNome()) > 0)) {
                fim = meio - 1;
            }
        }
        return null;
    }
    
    /**
     * Ordenar o array por nome
     */
    public static void ordenarArray(){
        Cliente aux = null;
        
        for(int i=0; i < lista.length; i++){
            for(int j = i+1; j<lista.length; j++){
                if(lista[i].getNome().compareTo(lista[j].getNome())>0){
                    aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }
            }
            System.out.println(lista[i]);
        }
    }
}
