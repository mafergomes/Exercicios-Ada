public class Exercicio3 {

    public static void main(String[] args) {
        int idade[]= {5,4,14};
        System.out.println(idadeEmDias(idade));
    }

    public static int idadeEmDias( int[] input) {
        int dias = input[2];
        int meses = input[1];
        int anos  = input [0];

        int totalDeDias = (anos*365)+(meses*30)+(dias);

        return totalDeDias;
    }
}