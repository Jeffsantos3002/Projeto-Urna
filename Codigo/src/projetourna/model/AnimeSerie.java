package projetourna.model;

import projetourna.model.abstractAndInterfaces.Candidato;

public class AnimeSerie implements Candidato {

    private String nome;
    private int votos;
    private String img;

    public String getImg() {
        return img;
    }

   
    public AnimeSerie(String nome, String img) {
        this.nome = nome.toUpperCase();
        this.img = img;
        this.votos = 0;
    }

    public String getNome() { return nome;  }

    public void setNome(String nome) {this.nome = nome;  }

    public int getVotos() { return votos; }


    @Override
    public String enviarDados() {
        String dados = this.nome +","+ this.votos + "," + this.img;
        return dados;
    }
    public void receberVotos(){
        this.votos++;
    }
}
/*-nome: String
-categoria: String
-eleito: Boolean
-votos: int
-posição: int
+getNome()
+getCategoria()
+getEleito()
getVotos()
+getPosição()
+setNome()
+setCategoria()
+setEleito()
+setVotos()
+setPosição()
+imprimir_r */