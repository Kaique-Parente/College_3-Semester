package models;

/**
 *
 * @author kaiqu
 */
public class Musica {
    private String nomeDaMusica;
    private int id;
    private String artista;
    private String linkYoutube;
    
    private static int valor = 1;

    public Musica(String nomeDaMusica, String artista, String linkYoutube) {
        this.nomeDaMusica = nomeDaMusica;
        this.artista = artista;
        this.linkYoutube = linkYoutube;
        this.id = valor++;
    }

    public String getNomeDaMusica() {
        return nomeDaMusica;
    }

    public void setNomeDaMusica(String nomeDaMusica) {
        this.nomeDaMusica = nomeDaMusica;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getLinkYoutube() {
        return linkYoutube;
    }

    public void setLinkYoutube(String linkYoutube) {
        this.linkYoutube = linkYoutube;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nNome: " + nomeDaMusica + "\nArtista: " + artista + "\nLink Youtube: " + linkYoutube + "\n----------------------------------------------------------------";
    }
}
