public class Exercicio2 {

    public static void main(String[] args) {
        int triangulo[] = {3, 3, 5};
        System.out.println(eUmTriangulo(triangulo));
    }

    public static boolean eUmTriangulo(int[] input) {
        double lado1 = input[0];
        double lado2 = input[1];
        double lado3 = input[2]; 

        if (lado1<lado2+lado3 && lado2<lado1+lado3 && lado3<lado1+lado2){
            return true;
        } else return false;
    }
}