import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

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

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("O tempo em minutos para maratonar a série " + lost.getNome() + " é: " + lost.getDuracaoEmMinutos() + " minutos");

    }
}
