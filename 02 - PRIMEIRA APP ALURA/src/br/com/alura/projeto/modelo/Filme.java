package br.com.alura.projeto.modelo;

import br.com.alura.projeto.Calculo.Classificavel;

public class Filme extends Titulo implements Classificavel{

    private int quantiadeDeSalas;
    public boolean emCartaz;

    public boolean isEmCartaz() {
        return emCartaz;
    }

    public void setEmCartaz(boolean emCartaz) {
        this.emCartaz = emCartaz;
    }

    public int getQuantiadeDeSalas() {
        return quantiadeDeSalas;
    }

    public void setQuantiadeDeSalas(int quantiadeDeSalas) {
        this.quantiadeDeSalas = quantiadeDeSalas;
    }   

    public void fichaTecnica() {
        System.out.println("----------------------------");
        System.out.println("FIXA TÉCNICA - [FILME] -\n");
        super.fichaTecnica();
        System.out.println("Quantidade de salas: " + quantiadeDeSalas);
        System.out.println("Em cartaz: " + emCartaz);

        if (emCartaz) {
            System.out.println("Ativa: sim");
        }else {
            System.out.println("Ativa: não");
        }
    }

    @Override
    public int getClassificacao() {
        if (quantiadeDeSalas <= 250) {
            return 0;
        }else if (quantiadeDeSalas <= 500){
            return 1;
        }else if (quantiadeDeSalas <= 750){
            return 2;
        }else if (quantiadeDeSalas <= 1000){
            return 3;
        }else if (quantiadeDeSalas <= 1250){
            return 4;
        }else {
            return 5;
        }
    }
}