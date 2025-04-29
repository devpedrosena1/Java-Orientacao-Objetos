public class Main {
    public static void main(String[] args) {

        // instanciar objeto
        Filme meuFilme = new Filme();
        meuFilme.anoDeLancamento = 2019;
        meuFilme.nome = "Creed";
        meuFilme.avaliacao = 9.6;

        System.out.println(meuFilme.anoDeLancamento);
        System.out.println(meuFilme.nome);
        System.out.println(meuFilme.avaliacao);

    }
}
