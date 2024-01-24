package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é consideraco sucesso absoluto e preferido pro todos.");
        }else {
            System.out.println(audio.getTitulo() + " também é um dos que todo mundo está curtindo.");
        }
    }
    
}
