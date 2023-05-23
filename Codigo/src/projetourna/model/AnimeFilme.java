package projetourna.model;

import projetourna.model.abstractAndInterfaces.Candidato;

public class AnimeFilme implements Candidato {
    
    private String nomeAnimeFilme;
    private Integer votos;
    private String img;

    public Integer getVotos() {
        return votos;
    }

    public AnimeFilme(String nomeAnimeFilme, String img) {
        this.nomeAnimeFilme = nomeAnimeFilme.toUpperCase();
        this.img = img;
        this.votos = 0;
    }

    public String getNomeAnimeFilme() {
        return nomeAnimeFilme;
    }
    public void setNomeAnimeFilme(String nomeAnimeFilme) {
        this.nomeAnimeFilme = nomeAnimeFilme;
    }

    @Override
    public String enviarDados(){
       String dados = this.nomeAnimeFilme + ","+ this.votos + "," + this.img;
       return dados;
    }

    @Override
    public void receberVotos() {
       this.votos++;

    }
}
