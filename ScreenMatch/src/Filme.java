public class Filme {

    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    // métodos
    int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    void exibreFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        System.out.println("Avaliação: " + somaDasAvaliacoes);
    }

    void avaliaFilme(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        double media = somaDasAvaliacoes / totalDeAvaliacoes;
        return media;
    }
}
