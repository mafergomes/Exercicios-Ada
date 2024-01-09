public class Exercicio5 {

    public static void main(String[] args) {
        int array[] = {1, 1, 2, 2, 2, 3, 3};
        System.out.println(numeroUnico(array));
    }

    public static int numeroUnico( int[] input) {

        for (int i = 0; i < input.length; i++) {
            int num = input[i];
            boolean swap = false;

            for (int j = 0; j < input.length; j++) {
                if (i != j && input[j] == num) {
                    swap = true;
                    break;
                }
            }

            if (!swap) {
                return num;
            }
        }
        return -1;
    }
}