public class App {
    public static void main(String[] args) throws Exception {
        ItensDaTela tela = new ItensDaTela();
        tela.todaTela();
        
               
        Filme filme1 = new Filme();

        filme1.nome = "Matrix";
        filme1.anoLancamento = 1999;
        filme1.quantiadeDeSalas = 137;
        filme1.incluidoNoPlano = true;
        filme1.duracaoEmMinutos = 168;

        filme1.avalia(8.7);
        filme1.avalia(9.8);
        filme1.avalia(9.2);
        filme1.mediaAvaliacao();

        filme1.fichaTecnica();
        
        tela.pequenoEspaco();
    }


}
