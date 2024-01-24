package Old;
import br.com.alura.projeto.Calculo.CalculadoraDeTempo;
import br.com.alura.projeto.Tela.ItensDaTela;
import br.com.alura.projeto.modelo.Filme;

public class AppOld1 {
    public static void main(String[] args) throws Exception {
        ItensDaTela tela = new ItensDaTela();
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        tela.todaTela();
        
               
        Filme filme1 = new Filme();
        Filme filme2 = new Filme();

        //filme1.nome = "Matrix";
        filme1.setNome("Matrix");

        //filme1.anoLancamento = 1999;
        filme1.setAnoLancamento(1999);

        //filme1.quantiadeDeSalas = 137;
        filme1.setQuantiadeDeSalas(137);

        //filme1.incluidoNoPlano = true;
        filme1.setIncluidoNoPlano(true);

        //filme1.duracaoEmMinutos = 168;
        filme1.setDuracaoEmMinutos(168);
        filme2.setDuracaoEmMinutos(32);
        calculadora.inclui(filme1);
        
        filme1.avalia(8.7);
        filme1.avalia(9.8);
        filme1.avalia(9.2);
        filme1.mediaAvaliacao();
        
        filme1.fichaTecnica();
        tela.pequenoEspaco();

        System.out.println("----------------------------");
        System.out.println("      PELO METO GET");
        System.out.println("----------------------------");
        System.out.println("Titulo: " + filme1.getNome());
        System.out.println("Ano de Lançamento: " + filme1.getAnoLancamento());
        System.out.println("Quantidade de salas: " + filme1.getQuantiadeDeSalas());
        System.out.println("Incluido no plano: " + filme1.isIncluidoNoPlano());
        System.out.println("Total de avaliação: " + filme1.getTotalDeAvaliacao());
        System.out.println("Avaliação: " + filme1.getAvaliacao());
        System.out.println("Duração em minutos: " + filme1.getDuracaoEmMinutos());
        System.out.println("----------------------------");
        tela.pequenoEspaco();


        
        
        calculadora.inclui(filme2);

        System.out.println(calculadora.getTempoTotal());
    }


}
