package iphone.reprodutorMusica;

import java.util.List;

public class ReprodutorMusicaXpto extends ReprodutorMusica {

    public ReprodutorMusicaXpto(List<String> musicas) {
        super(musicas);
    }

    @Override
    void exibirMusicaAtual() {
        System.out.println("Tocando " + musicas.get(musicaAtual));
    }

    @Override
    boolean temMusica() {
        return !musicas.isEmpty();
    }

    @Override
    public void selecionarMusica() {
        super.selecionarMusica();
        if (temProximaMusica()) {
            if (!estaTocando) estaTocando = true;
        } else {
            System.out.println("Fim da playlist");
            musicaAtual = -1;
        }
        selecionarProximaMusica();
    }

    private void selecionarProximaMusica() {
        System.out.println("Próxima música...");
        musicaAtual++;
        exibirMusicaAtual();
    }

    @Override
    boolean temProximaMusica() {
        return temMusica() && musicas.size() > musicaAtual+1;
    }
}
