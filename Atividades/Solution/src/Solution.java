public class Solution {

    public static void main(String[] args) {
        int entrada [][]= {{5, 6, 12}, {10, 8, 13}, {21, 10, 25}};
        int saida []= {2017, 3903, 7990};

        int resultado = 0;
        for (int i=0; i<entrada.length; i++) {
            resultado = idadeEmDias(entrada[i]);
            System.out.println("Resultado da entrada: " + i + (resultado == saida[i] ? " Passou" : " Falhou") + ". Valor obtido: " + resultado + ". Valor esperado: " + saida[i]);
        }

    }

    public static int idadeEmDias(int[] input) {
        int dias = input[2];
        int meses = input[1];
        int anos  = input [0];

        int totalDeDias = (anos*365)+(meses*30)+(dias);

        return totalDeDias;
    }
}