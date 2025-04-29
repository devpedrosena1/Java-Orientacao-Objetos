public class Main {
    public static void main(String[] args) {

        // instanciar objeto
        Filme meuFilme = new Filme();
        meuFilme.anoDeLancamento = 2019;
        meuFilme.nome = "Creed";
        meuFilme.somaDasAvaliacoes = 9.6;

        meuFilme.exibreFichaTecnica();

        meuFilme.avaliaFilme(8.90);
        meuFilme.avaliaFilme(9.70);

        System.out.println("Soma das avaliações: " + meuFilme.somaDasAvaliacoes);
        System.out.println("Total de avaliações: " + meuFilme.totalDeAvaliacoes);

        System.out.println("Média das avaliações: " + meuFilme.pegaMedia());

    }
}
