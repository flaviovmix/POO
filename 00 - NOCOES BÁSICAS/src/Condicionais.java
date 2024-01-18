public class Condicionais {
    public static void main(String[] args) {
        int ano;
        boolean ativo;
        double nota;
        String texto = "conteúdo";


        //não se usa == para comparar Stings se usa .equals
        if (texto.equals("conteúdo")) {
            System.out.println("O texto digitado foi conteúdo");
        }else {
            System.out.println("O texto foi não foi conteúdo");
        }


        ano = 2024;
        if (ano > 2023) {
            System.out.println("Filme novo");
        }else if (ano < 2023) {
            System.out.println("Filme antigo");
        } else {
		    System.out.println("Ano inexistente");
		}


        nota = 9;
        ativo = true;
        if (nota >= 9 && ativo) {
            System.out.println("Exibir no catalogo de indicações");
        }


//        "==" (igual a)
//        "!=" (diferente de)
//        ">" (maior que)
//        ">=" (maior ou igual a)
//        "<" (menor que)
//        "<=" (menor ou igual a)

//        (a && b) = (a and b)
//        (a || b) = (a or b)
//        (!a) = (!a) negação

    }
}
