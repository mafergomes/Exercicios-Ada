public class Exercicio4 {

    public static void main(String[] args) {
        double notas[] = {5.0, 4.3, 8.0, 7.0};
        System.out.println(mediaAproveitamento(notas));
    }

    public static String mediaAproveitamento(double[] input) {

        double nota1 = input[0];
        double nota2 = input[1];
        double nota3 = input[2];
        double media = input[3];
        String mediaFinal = "";

        double notaFinal = (nota1 + nota2*2 + nota3*3 + media)/7;

        if (notaFinal>=9.0) {
            mediaFinal = "A";
        } else if (notaFinal<9.0 && notaFinal>=7.5){
            mediaFinal = "B";
        } else if (notaFinal<7.5 && notaFinal>=6.0){
            mediaFinal = "C";
        } else mediaFinal = "D";

        return mediaFinal;
    }
}