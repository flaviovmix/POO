public class CasasDecimaisCasting {
    public static void main(String[] args) {
        double nota1;
        double nota2;
        double nota3;
        double media;

        nota1 = 0.4;
        nota2 = 7.9;
        nota3 = 8.6;

        //somente duas casas decimais
        media = (nota1 + nota2 + nota3) / 3;
        String mediaFormatada = String.format("%.2f", media);
        System.out.println(mediaFormatada);

        //converter para inteiro, perdendo as casas decimais
        int somenteInteiroDaMedia;
        somenteInteiroDaMedia = (int) media;
        System.out.println(somenteInteiroDaMedia);
    }
}