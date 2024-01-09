import java.util.Arrays;

public class Exercicio3 {
    public static void main(String[] args) {
        int[] numerosRandomicos = new int[20];

        for(int i=0; i<numerosRandomicos.length; i++){
            numerosRandomicos[i] = (int)(Math.random()*100);
        }

        ordenar(numerosRandomicos);
        System.out.println(Arrays.toString(numerosRandomicos));
    }


    public static void ordenar(int[] x){
        boolean swap= false; 
        do { 
            swap= false;
            for (int i=0; i<x.length-1; i++) { 
                if (x[i]>x[i+1]) { 
                    int tmp= x[i]; 
                    x[i]=x[i+1]; 
                    x[i+1]=tmp; 
                    swap=true;
                }
            }
        } while (swap);
    }

}
