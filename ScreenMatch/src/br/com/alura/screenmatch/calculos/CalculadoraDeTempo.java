package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal = 0;

    public int getTempoTotal(){
        return this.tempoTotal;
    }

    /*
    // movies
    public void inclui(Filme filme) {
        this.tempoTotal += filme.getDuracaoEmMinutos();
    }

    // series
    public void inclui(Serie serie) {
        this.tempoTotal += serie.getDuracaoEmMinutos();
    }

    // chanel
    */

    public void inclui(Titulo titulo) {
        System.out.println("Analisando tempo de duração de: " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
