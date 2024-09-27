package model.entities;

import java.util.ArrayList;

/**
 *
 * @author kaiqu
 */
public class Pedido {

    private Float valor_total = 0f;
    private ArrayList<ItemPedido> itens;

    public Pedido(ItemPedido item) {
        this.itens = new ArrayList<>();
        itens.add(item);
    }

    public void adicionar_item(ItemPedido item) {
        itens.add(item);
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public Float obter_total() {
        for(ItemPedido i : itens){
            valor_total += i.getQuantidade() * i.getProduto().getValor();
        }
        
        return valor_total;
    }
}
