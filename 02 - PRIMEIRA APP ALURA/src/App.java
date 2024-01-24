import br.com.alura.projeto.Calculo.CalculadoraDeTempo;
import br.com.alura.projeto.Calculo.FiltroRecomendacao;
import br.com.alura.projeto.Tela.ItensDaTela;
import br.com.alura.projeto.modelo.Filme;
import br.com.alura.projeto.modelo.Serie;

public class App {
    public static void main(String[] args) {
        ItensDaTela itensTela = new ItensDaTela();
        CalculadoraDeTempo somarTempo = new CalculadoraDeTempo();
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        itensTela.todaTela();

        Filme filme1 = new Filme();
        filme1.setNome("Cidade de Deus");
        filme1.setAnoLancamento(2000);
        filme1.setEmCartaz(true);
        filme1.setQuantiadeDeSalas(1005);
        filme1.setDuracaoEmMinutos(117);
        somarTempo.inclui(filme1);
        filme1.setIncluidoNoPlano(true);
        filme1.avalia(9.5);
        filme1.avalia(7);
        filme1.avalia(9);
        filme1.mediaAvaliacao();
        filme1.fichaTecnica();
        filtro.filtra(filme1);

        //itensTela.pequenoEspaco();

        Filme filme2 = new Filme();
        filme2.setNome("Matrix");
        filme2.setAnoLancamento(1999);
        filme2.setEmCartaz(false);
        filme2.setQuantiadeDeSalas(185);
        filme2.setDuracaoEmMinutos(173);
        somarTempo.inclui(filme2);
        filme2.setIncluidoNoPlano(true);
        filme2.avalia(9.5);
        filme2.avalia(10);
        filme2.avalia(9.7);
        filme2.mediaAvaliacao();
        filme2.fichaTecnica();
        filtro.filtra(filme2);

        //itensTela.pequenoEspaco();

        Serie serie1 = new Serie();
        serie1.setNome("Lost");
        serie1.setAnoLancamento(2004);
        serie1.setAtiva(true);
        serie1.setTemporadas(16);
        serie1.setEpisodios(263);
        serie1.setDuracaoEmMinutos(720);
        somarTempo.inclui(serie1);
        serie1.setIncluidoNoPlano(true);
        serie1.avalia(7);
        serie1.avalia(9);
        serie1.avalia(8);
        serie1.mediaAvaliacao();
        serie1.fichaTecnica();
        filtro.filtra(serie1);

        System.out.println("----------------------------");
        System.out.println("\nTotal de tempo: " +
                            somarTempo.getTempoTotal() + " minutos.\n"
                          );

        itensTela.linhas();
        itensTela.pequenoEspaco();
    
        itensTela.pequenoEspaco();

    }
    
}
