import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int x = s.nextInt();
        int[] array = new int[x];
        double media=0;
        
        for(int i=0;i<array.length;i++){
          array[i] = (int)(Math.random() *100); 
          System.out.print("["+ array[i]+ "]"); 
          media += array[i];
        }
        media = media/x;
        System.out.println();
        System.out.printf("Média dos valores: %.2f\n", media);
    }
}
