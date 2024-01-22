package br.com.alura.projeto.modelo;

public class Serie extends Titulo {

    private int temporadas;
    private int episodios;
    private boolean ativa;

    public boolean isAtiva() {
        return ativa;
    }
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public int getEpisodios() {
        return episodios;
    }
    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public void fichaTecnica() {
        System.out.println("----------------------------");
        System.out.println("FIXA TÉCNICA - [SÉRIE] -\n");
        super.fichaTecnica();
        System.out.println("Quantidade de temporadas: " + temporadas);
        System.out.println("Total de epsódios: " + episodios);

        if (ativa) {
            System.out.println("Ativa: sim");
        }else {
            System.out.println("Ativa: não");
        }
    }

}
