package iphone;

import iphone.reprodutorMusica.ReprodutorMusica;
import iphone.reprodutorMusica.ReprodutorMusicaXpto;

import java.util.Arrays;
import java.util.List;

public class Iphone {
    public static void main(String[] args) {
        List<String> musicas = Arrays.asList("Tua de Liniker","Eu Amo Você de Tim Maia", "Um Amor Puro de Djavan", "Malandragem de Cássia Eller");
        ReprodutorMusica reprodutorMusica = new ReprodutorMusicaXpto(musicas);
        reprodutorMusica.tocar();
        reprodutorMusica.tocar();
        reprodutorMusica.selecionarMusica();
        reprodutorMusica.selecionarMusica();
        reprodutorMusica.selecionarMusica();
        reprodutorMusica.selecionarMusica();
        reprodutorMusica.tocar();
        reprodutorMusica.tocar();
        reprodutorMusica.selecionarMusica();
    }
}
