package iphone.reprodutorMusica;

import java.util.List;

public abstract class ReprodutorMusica {

    protected final List<String> musicas;
    protected int musicaAtual = 0;
    protected boolean estaTocando = false;

    protected ReprodutorMusica(List<String> musicas) {
        this.musicas = musicas;
    }

    public void tocar(){
        System.out.println("-----");
        if(estaTocando)
            System.out.println("Música pausada");
        else
            System.out.println("Tocando música...");

        estaTocando = !estaTocando;
        if(temMusica() && estaTocando){
            exibirMusicaAtual();
        }
    }
    public void selecionarMusica(){
        System.out.println("-----");
    }
    abstract void exibirMusicaAtual();

    abstract boolean temMusica();
    abstract boolean temProximaMusica();
}
