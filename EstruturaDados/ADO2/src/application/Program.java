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
        1. Inserir M�sica
        2. Remover M�sica
        3. Pesquisar M�sica
        4. Exibir Playlist
        5. Atualizar M�sica
        6. Fechar Programa
        """;

        int escolha = 1, qtdUsuarios = 0, idEscolha = 0;

        String nomeMusica = "", autor = "", linkYoutube = "";

        while (escolha > 0 && escolha < 6) {
            try {
                escolha = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
                switch (escolha) {
                    case 1 -> {
                        qtdUsuarios = Integer.parseInt(JOptionPane.showInputDialog(null, "Voc� quer adicionar quantas m�sicas?"));
                        for (int i = 0; i < qtdUsuarios; i++) {
                            nomeMusica = JOptionPane.showInputDialog(null, "Digite o nome da m�sica:");

                            autor = JOptionPane.showInputDialog(null, "Digite o autor da m�sica:");
                            linkYoutube = JOptionPane.showInputDialog(null, "Digite o link da m�sica:");
                            p1.inserir(new Musica(nomeMusica, autor, linkYoutube));
                            JOptionPane.showMessageDialog(null, "M�sica Adicionada!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    case 2 -> {
                        idEscolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID da M�sica para remover!"));
                        if (p1.remover(idEscolha)) {
                            JOptionPane.showMessageDialog(null, "M�sica Removida!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "ID n�o encontrado!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    case 3 -> {
                        idEscolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID da M�sica para pesquisar!"));
                        Musica mPesq = p1.pesquisar(idEscolha);
                        if (mPesq != null) {
                            JOptionPane.showMessageDialog(null, mPesq, "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "ID n�o encontrado!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    case 4 -> {
                        p1.exibir();
                    }
                    case 5 -> {
                        idEscolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID da M�sica para atualizar!"));

                        nomeMusica = JOptionPane.showInputDialog(null, "Digite o nome da m�sica atualizada:");

                        autor = JOptionPane.showInputDialog(null, "Digite o autor da m�sica atualizada:");
                        linkYoutube = JOptionPane.showInputDialog(null, "Digite o link da m�sica atualizada:");
                        p1.atualizar(idEscolha, new Musica(nomeMusica, autor, linkYoutube));

                        JOptionPane.showMessageDialog(null, "M�sica Atualizada!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                    }
                    case 6 -> {
                        JOptionPane.showMessageDialog(null, "Finalizando Programa!", "At� a Proxima!", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                    default -> {
                        JOptionPane.showMessageDialog(null, "Selecione uma Op��o v�lida!", "ERRO!", JOptionPane.ERROR_MESSAGE);
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
