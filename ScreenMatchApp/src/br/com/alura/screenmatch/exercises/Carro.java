package br.com.alura.screenmatch.exercises;

public class Carro {

    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void definirModelo(String modelo){
        this.modelo = modelo;
    }

    public void definirPrecos(double precoAno1, double precoAno2, double precoAno3){
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public void exibirInfo(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço do ano 1: " + precoAno1);
        System.out.println("Preço do ano 2: " + precoAno2);
        System.out.println("Preço do ano 3: " + precoAno3);
        System.out.println("Maior preço: " + calcularMaiorPreco());
        System.out.println("Menor preço: " + calcularMenorPreco());
    }

    private double calcularMaiorPreco() {
        double maiorPreco = precoAno1;

        if (precoAno2 > precoAno3) {
            maiorPreco = precoAno2;
        }
        if (precoAno3 > precoAno2) {
            maiorPreco = precoAno3;
        }

        return maiorPreco;
    }

    private double calcularMenorPreco() {
        double menorPreco = precoAno1;

        if (precoAno2 < precoAno3) {
            menorPreco = precoAno2;
        }
        if (precoAno3 < precoAno2) {
            menorPreco = precoAno3;
        }
        return menorPreco;
    }

}
