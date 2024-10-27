package application;

import javax.swing.JOptionPane;
import lista.Playlist;
import models.Musica;

/**
 *
 * @author kaiqu
 */
public class Program {

    public static void main(String[] args) {
        Playlist p1 = new Playlist();

        String menu
                = """
             Playlist
        ===================
        1. Inserir Música
        2. Remover Música
        3. Pesquisar Música
        4. Exibir Playlist
        5. Atualizar Música
        6. Fechar Programa
        """;

        int escolha = 1, qtdUsuarios = 0, idEscolha = 0;

        String nomeMusica = "", autor = "", linkYoutube = "";

        while (escolha > 0 && escolha < 6) {
            try {
                escolha = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
                switch (escolha) {
                    case 1 -> {
                        qtdUsuarios = Integer.parseInt(JOptionPane.showInputDialog(null, "Você quer adicionar quantas músicas?"));
                        for (int i = 0; i < qtdUsuarios; i++) {
                            nomeMusica = JOptionPane.showInputDialog(null, "Digite o nome da música:");

                            autor = JOptionPane.showInputDialog(null, "Digite o autor da música:");
                            linkYoutube = JOptionPane.showInputDialog(null, "Digite o link da música:");
                            p1.inserir(new Musica(nomeMusica, autor, linkYoutube));
                            JOptionPane.showMessageDialog(null, "Música Adicionada!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    case 2 -> {
                        idEscolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID da Música para remover!"));
                        if (p1.remover(idEscolha)) {
                            JOptionPane.showMessageDialog(null, "Música Removida!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "ID não encontrado!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    case 3 -> {
                        idEscolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID da Música para pesquisar!"));
                        Musica mPesq = p1.pesquisar(idEscolha);
                        if (mPesq != null) {
                            JOptionPane.showMessageDialog(null, mPesq, "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "ID não encontrado!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    case 4 -> {
                        p1.exibir();
                    }
                    case 5 -> {
                        idEscolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID da Música para atualizar!"));

                        nomeMusica = JOptionPane.showInputDialog(null, "Digite o nome da música atualizada:");

                        autor = JOptionPane.showInputDialog(null, "Digite o autor da música atualizada:");
                        linkYoutube = JOptionPane.showInputDialog(null, "Digite o link da música atualizada:");
                        p1.atualizar(idEscolha, new Musica(nomeMusica, autor, linkYoutube));

                        JOptionPane.showMessageDialog(null, "Música Atualizada!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                    }
                    case 6 -> {
                        JOptionPane.showMessageDialog(null, "Finalizando Programa!", "Até a Proxima!", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                    default -> {
                        JOptionPane.showMessageDialog(null, "Selecione uma Opção válida!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                        escolha = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Preencha os campos corretamente!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                escolha = 1; 
            }
        }
    }
}
