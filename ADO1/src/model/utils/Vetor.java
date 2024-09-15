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

    private Cliente[] lista = new Cliente[5];
    private int indice = 0;

    /**
     * Cadastrar no array objetos do tipo Cliente
     *
     * @param cliente Cliente
     */
    public void inserir(Cliente cliente) {
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
    public boolean remover(int id) {
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
    public int pesquisar(int id) {
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
    public Cliente pesquisarCadastro(int id) {
        for (int i = 0; i < indice; i++) {
            if (id == lista[i].getId()) {
                return lista[i];
            }
        }
        return null;
    }

    /**
     * Alocar um novo Array quando o principal exceder o seu tamanho
     *
     * @return Cliente[]
     */
    private Cliente[] alocarNovoArray() {
        Cliente[] novo = new Cliente[lista.length + (lista.length / 2)];

        System.arraycopy(lista, 0, novo, 0, lista.length);

        return novo;
    }

    /**
     * Busca Binaria pelo nome do Cliente e retornar a instância
     *
     * @param p
     * @return Cliente
     */
    public Cliente buscaBinaria(String p) {
        int inicio = 0, meio = 0, fim;
        fim = indice - 1;

        if (listaPar()) {
            while (inicio <= fim) {
                meio = (inicio + fim) / 2;
                if (lista[meio] != null) {
                    if (lista[meio].getNome().equals(p)) {
                        return lista[meio];
                    } else if ((lista[meio].getNome().compareTo(p) < 0)) {
                        inicio = meio + 1; //Desce a lista
                    } else if ((lista[meio].getNome().compareTo(p) > 0)) {
                        fim = meio - 1; //Sobe a lista
                    } 
                } else {
                     inicio = meio + 1;
                }
            }
        } else {
            return null;
        }
        return null;
    }

    /**
     * Ordenar o array por nome
     */
    public void ordenarArray() {
        Cliente aux = null;
        if (listaPar()) {
            for (int i = 0; i < indice; i++) {
                for (int j = i + 1; j < indice; j++) {
                    if (lista[i].getNome().compareTo(lista[j].getNome()) > 0) {
                        aux = lista[i];
                        lista[i] = lista[j];
                        lista[j] = aux;
                    }
                }
                System.out.println(lista[i]);
            }
        } else {
            for (int i = 0; i < indice; i++) {
                if (lista[i] != null) {
                    System.out.println(lista[i]);
                } else {
                    System.out.println("Não Existe nenhum Cliente!");
                }
            }
        }
    }

    /**
     * Verificar se a lista é par
     *
     * @return boolean
     */
    private boolean listaPar() {
        int qtd = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                qtd++;
            }
        }
        return qtd > 1;
    }
}
