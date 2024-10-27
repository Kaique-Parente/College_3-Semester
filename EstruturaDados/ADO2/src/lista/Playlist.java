package lista;

import javax.swing.JOptionPane;
import models.Musica;

public class Playlist {

    private No inicio, aux, atual;

    private boolean listaVazia() {
        return inicio == null;
    }

    public void inserir(Object objeto) {
        if (listaVazia()) {
            inicio = new No(null, null, objeto);
            aux = inicio;
        } else {
            atual = new No(null, aux, objeto);
            aux.setProx(atual);
            aux = atual;
        }
    }

    public boolean remover(int id) {
        No rem = inicio;

        while (rem != null) {
            Musica m = (Musica) rem.getObjeto();
            if (m.getId() == id) {
                break;
            }
            rem = rem.getProx();
        }

        if (rem != null) {
            if (rem == inicio) {
                inicio = rem.getProx();
                rem.setProx(null);
                inicio.setAnt(null);
            } else if (rem == atual) {
                atual = rem.getAnt();
                aux = atual;
                rem.setAnt(null);
                atual.setProx(null);
            } else {
                rem.getAnt().setProx(rem.getProx());
                rem.getProx().setAnt(rem.getAnt());
            }
            return true;
        }
        return false;
    }

    public Musica pesquisar(int id) {
        No ref = inicio;
        while (ref != null) {
            Musica m = (Musica) ref.getObjeto();
            if (m.getId() == id) {
                return m;
            }
            ref = ref.getProx();
        }
        return null;
    }

    public void exibir() {
        No ref = inicio;
        String msg = "============================PLAYLIST============================\n";
        while (ref != null) {
            msg += ref.getObjeto() + "\n";
            ref = ref.getProx();
        }
        if (!msg.equals("")) {
            JOptionPane.showMessageDialog(null, msg);
        } else {
            JOptionPane.showMessageDialog(null, "Não existem músicas nessa playlist!", "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean atualizar(int id, Object newObj) {
        Musica musicaAntiga = pesquisar(id);
        if (musicaAntiga != null) {
            Musica musicaAtualizada = (Musica) newObj;

            musicaAntiga.setNomeDaMusica(musicaAtualizada.getNomeDaMusica());
            musicaAntiga.setArtista(musicaAtualizada.getArtista());
            musicaAntiga.setLinkYoutube(musicaAtualizada.getLinkYoutube());
            return true;
        }

        return false;
    }

}
