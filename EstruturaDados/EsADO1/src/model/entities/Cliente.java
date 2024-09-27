package model.entities;

/**
 *
 * @author kaiqu
 */
public class Cliente {
    private String nome;
    private Integer id;
    
    private static int valor = 1;

    public Cliente(String nome) {
        this.nome = nome;
        id = valor++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + ", id: " + id;
    }
}
