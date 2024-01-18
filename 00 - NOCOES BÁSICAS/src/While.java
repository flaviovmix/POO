import java.util.Scanner;

public class While {
    public static void main(String[] args) {
                //contando até 10
        int contador = 0;
        while (contador <= 10) {
            System.out.println(contador);
            contador++;
        }

        System.out.println("---------------------");
        Scanner leitura = new Scanner(System.in);
        double valoresDigitados;
        double soma = 0;
        double mediaDosValoresDigitados;

        System.out.println("Calcula de média, digite 3 valores.");

        contador = 1;
        while (contador <= 3) {
            System.out.print("digite o " + contador + "º valor: ");
            valoresDigitados = leitura.nextDouble();
            soma += valoresDigitados;
            contador++;
        }

        mediaDosValoresDigitados = soma / 3;
        String mediaFormatada = String.format("%.1f", mediaDosValoresDigitados);
        System.out.println("A média dos valores digitados foi " + mediaFormatada);

    }
}
