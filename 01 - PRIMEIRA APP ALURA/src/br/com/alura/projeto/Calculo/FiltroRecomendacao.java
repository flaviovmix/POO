package br.com.alura.projeto.Calculo;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel) {
        //if (classificavel.getClassificacao() == 1) {
        //    System.out.println("Neutro.");
        //}else if (classificavel.getClassificacao() == 2) {
        //    System.out.println("Regular.");
        //}else if (classificavel.getClassificacao() == 3) {
        //    System.out.println("Bom.");
        //}else if (classificavel.getClassificacao() == 4) {
        //    System.out.println("Ótimo.");
        //}else {
        //    System.out.println("Exelente.");
        //}

        switch (classificavel.getClassificacao()) {
            case 0:
                System.out.println("Classiicação: Neutro");
            break;
            case 1:
                System.out.println("Classiicação: Regular");
                break;
            case 2:
                System.out.println("Classiicação: Bom");
                break;
            case 3:
                System.out.println("Classiicação: Muito positivas");
                break;
            case 4:
                System.out.println("Classiicação: Ótimo");
                break;
            case 5:
                System.out.println("Classiicação: Exelente");
                break;
            default:
                System.out.println("Classiicação: Impossível exibir uma classificação");
                break;
         }
    }

}
