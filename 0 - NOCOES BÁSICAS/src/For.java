import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        //contando até 10
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("---------------------");
        Scanner leitura = new Scanner(System.in);
        double valoresDigitados;
        double soma = 0;
        double mediaDosValoresDigitados;

        System.out.println("Calcula de média, digite 3 valores.");
        for (int i = 1; i <= 3; i++) {
            System.out.print("digite o " + i + "º valor: ");
            valoresDigitados = leitura.nextDouble();
            soma += valoresDigitados;
        }

        mediaDosValoresDigitados = soma / 3;
        String mediaFormatada = String.format("%.1f", mediaDosValoresDigitados);
        System.out.println("A média dos valores digitados foi " + mediaFormatada);

    }
}
