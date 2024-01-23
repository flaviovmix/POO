package br.com.alura.projeto.modelo;
public class Titulo {
        
    private String nome;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacao;
    private int duracaoEmMinutos; 
    protected String avaliacao;
    private int totalDeAvaliacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }


    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }


    public void fichaTecnica() {

        System.out.println("Título: " + nome);
        System.out.println("Ano de Lançamento: " + anoLancamento);

        if (incluidoNoPlano) {
            System.out.println("Ativa: sim");
        }else {
            System.out.println("Ativa: não");
        }

        System.out.println("Total de avaliação: " + totalDeAvaliacao);
        System.out.println("Avaliação: " + avaliacao);        
    }

    public void avalia(double nota) {
        totalDeAvaliacao ++; 
        somaDasAvaliacao += nota;
    }

    public void mediaAvaliacao () {
        double media = somaDasAvaliacao / totalDeAvaliacao; 
        avaliacao = String.format("%.1f", media);
    }

}
