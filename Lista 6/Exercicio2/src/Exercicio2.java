public class Exercicio2 {

    public static void main(String[] args) {
        String teste = "cocada";
        System.out.println(primeiroCaractereUnico(teste));
    }

    public static int primeiroCaractereUnico(String input) {

        int[] ocorrencias = new int[256];

        for (char c : input.toCharArray()) {
            ocorrencias[c]++;
        }

        for (int i = 0; i < input.length(); i++) {
            if (ocorrencias[input.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }
}