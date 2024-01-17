public class Filme {
        
    String nome;
    int anoLancamento;
    int quantiadeDeSalas;
    boolean incluidoNoPlano;
    double somaDasAvaliacao;
    String avaliacao;
    int totalDeAvaliacao;
    int duracaoEmMinutos;

    void fichaTecnica() {
        System.out.println("----------------------------");
        System.out.println("       FIXA TÉCNICA");
        System.out.println("----------------------------");
        System.out.println("Título: " + nome);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Quantidade de salas: " + quantiadeDeSalas);
        System.out.println("Incluido no plano: " + incluidoNoPlano);
        System.out.println("Total de avaliação: " + totalDeAvaliacao);
        System.out.println("Avaliação: " + avaliacao);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("----------------------------");
    }

    void avalia(double nota) {
        totalDeAvaliacao ++; 
        somaDasAvaliacao += nota;
    }

    void mediaAvaliacao () {
        double media = somaDasAvaliacao / totalDeAvaliacao; 
        avaliacao = String.format("%.1f", media);
    }

}
