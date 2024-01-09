/*import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número impar: ");
        int num = s.nextInt();
        int tmp= num;
        for (int i=0; i<=num; i++){
            for (int j=0; j<=tmp-1; j++){
                System.out.print("*");
            }
            if(tmp==1){
                break;
            }
            System.out.println();
            tmp--;
        }
        s.close();
    }
}*/
/*import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número impar: ");
        int num = s.nextInt();
        for (int i=0; i<num; i++){
            //imprimir os espaços 
            for (int j=num-i; j<num; j++){
                System.out.print(" ");
            }           
            //numero total de asteriscos  (num*2-1)-i*2
            for (int j=0; j<(num*2-1)-i*2; j++){
                System.out.print("*");
            }           
            System.out.println();
        }
        s.close();
    }
}*/
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número impar: ");
        int num = s.nextInt();
        int maxQtdAst = num*2-1;
        int maxQtdEsp = maxQtdAst/2;
        int qtdAst = 1;
        int numImp = num*2-1;
        int coringa = 1;

        for (int i=0; i<numImp; i++){
            for (int j=0; j<maxQtdEsp; j++) {
                System.out.print(" ");
            }
            
            for (int j=0; j<qtdAst; j++) {
                System.out.print("*");
            }

            if(qtdAst == maxQtdAst) {
                coringa=-1;
            }

            maxQtdEsp-=1*coringa;
            qtdAst+=2*coringa;
            System.out.println();
        }
        s.close();
    }
}
