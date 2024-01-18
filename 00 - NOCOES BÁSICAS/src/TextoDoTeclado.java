import java.util.Scanner;

public class TextoDoTeclado { 
    public static void main(String[] args) {
        Scanner  leitura = new Scanner(System.in);

        //aqui eu coloquei somente print para não pular a linha
        System.out.print("Digite um texto ou palavra: ");
        //aqui foi usado o nextLine, pois se espera um texto
        String textoDigitado = leitura.nextLine();
        System.out.println("O texto digitado foi " + textoDigitado);

        System.out.print("Digite um valor inteiro: ");
        //aqui foi usado nextInt, pois se espera um inteniro
        int numeroInteiro = leitura.nextInt();
        System.out.println("O valor digitado foi " + numeroInteiro);

        //e assim por diante
        System.out.print("Digite um valor com casas decimais, separando com virgula: ");
        double numeroComCasasDecimais = leitura.nextDouble();
        System.out.println("O valor digitado foi " + numeroComCasasDecimais);
    }
}