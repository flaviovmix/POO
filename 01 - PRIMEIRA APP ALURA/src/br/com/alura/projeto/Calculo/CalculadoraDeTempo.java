package br.com.alura.projeto.Calculo;

import br.com.alura.projeto.modelo.Filme;
import br.com.alura.projeto.modelo.Serie;
import br.com.alura.projeto.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui (Filme f) {
//        this.tempoTotal+= f.getDuracaoEmMinutos();
//    }
//    
//    public void inclui (Serie s) {
//        this.tempoTotal+= s.getMinutosPorEpsodio();
//    }

    public void inclui (Titulo t) {
        this.tempoTotal+= t.getDuracaoEmMinutos();
    }

}
