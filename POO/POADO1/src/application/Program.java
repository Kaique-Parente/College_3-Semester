/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import model.entities.ItemPedido;
import model.entities.Pedido;
import model.entities.Produto;

/**
 *
 * @author kaiqu
 */
public class Program {
    public static void main(String[] args) {
        Produto p1 = new Produto(1001, 12.99f, "Manga Rosa");
        Produto p2 = new Produto(1002, 5.99f, "Abacate");
        Produto p3 = new Produto(1003, 7.99f, "Maça Argentina");
        
        ItemPedido it1 = new ItemPedido(2, p1);
        ItemPedido it2 = new ItemPedido(3, p2);
        ItemPedido it3 = new ItemPedido(4, p3);
        
        Pedido p = new Pedido(it1);
        p.adicionar_item(it2);
        p.adicionar_item(it3);
        
        System.out.println("Valor total: " + p.obter_total());
    }
}
