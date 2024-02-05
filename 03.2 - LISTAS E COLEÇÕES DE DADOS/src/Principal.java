import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa ("Flávio", 42);
        Pessoa pessoa2 = new Pessoa("Adriely", 32);
        Pessoa pessoa3 = new Pessoa("Pedro", 7);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira Pessoa: " + listaDePessoas.get(0) + "\n");

        System.out.println("Lista de Pessoas:");

        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }

    }
}
