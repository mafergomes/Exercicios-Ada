import java.util.Arrays;

public class Exemplo3 {
    /*public static void main(String[] args) {
        int a = 0;
        int b = 0;

        if (a++ == 1 || b++ == 1) {
            System.out.println("A é igual a UM");
        }

        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
    */
    public static void main(String[] args) {
        parOuImpar(0);
        parOuImpar(1);
        parOuImpar(2);
        parOuImpar(3);
        parOuImpar(4);
        parOuImpar(5);

        int[] exemplo = new int[10];
        System.out.println(Arrays.toString(exemplo));
    }

    public static void parOuImpar(int i) {
        System.out.println(i%2==0 ? "Par" : "Ímpar");
    }
}
