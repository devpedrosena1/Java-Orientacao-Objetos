package br.com.alura.screenmatch.exercises;

public class Main {

    public static void main(String[] args) {

        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("Sedan");
        meuCarro.definirPrecos(20000, 22000, 30000);
        meuCarro.exibirInfo();

    }
}
