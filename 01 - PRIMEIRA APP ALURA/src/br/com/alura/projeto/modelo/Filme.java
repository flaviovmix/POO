package br.com.alura.projeto.modelo;

public class Filme extends Titulo{

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
}