import br.com.alura.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {

        // instanciar objeto
        Filme meuFilme = new Filme();

        meuFilme.setNome("Creed");
        meuFilme.setAnoDeLancamento(2019);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();

        meuFilme.avaliaFilme(8.90);
        meuFilme.avaliaFilme(9.70);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());

        System.out.println("Média das avaliações: " + meuFilme.pegaMedia());

    }
}
