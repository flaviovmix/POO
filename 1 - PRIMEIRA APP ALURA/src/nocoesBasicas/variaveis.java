package nocoesBasicas;
//import LimpaTela;

public class variaveis {

    public static void main(String[] args) {
        //LimpaTela limparTela = new LimpaTela();
        //limparTela.todaTela();
        
        //boolean: representa valores lógicos (true ou false).
        //byte: representa valores inteiros de 8 bits (-128 a 127).
        //char: representa caracteres individuais.
        //short: representa valores inteiros de 16 bits (-32.768 a 32.767).
        //int: representa valores inteiros de 32 bits (-2.147.483.648 a 2.147.483.647).
        //long: representa valores inteiros de 64 bits (-9.223.372.036.854.775.808 a 9.223.372.036.854.775.807).
        //float: representa valores de ponto flutuante com precisão limitada.
        //double: representa valores de ponto flutuante com maior precisão.   
        
        System.out.println("VARIÁVEIS");

        String nome = "Flavio";
        System.out.println(nome);

        int idade = 25;
        System.out.println(idade);

        byte numero = 10;
        System.out.println(numero);

        short quantidade = 1000;
        System.out.println(quantidade);

        long populacao = 10000000000L;
        System.out.println(populacao);

        float altura = 1.75f;
        System.out.println(altura);

        double salario = 2500.50;
        System.out.println(salario);

        char letra = 'A';
        System.out.println(letra);

        boolean ativo = true;
        System.out.println(ativo);

        System.out.println("Nome: " + nome + ", idade: " + idade + ".");

        //string com várias linhas
        String sinopse;
        sinopse = """
                    Filme Top Gun
                    Filme de aventura com galã dos anos 80
                    Muito bom!
                    Ano de Lançamento
                """;    
        
    }
}
