public class Exercicio3 {

    public static void main(String[] args) {
        int entrada=75;
        System.out.println(geraSequenciaFibonacci(entrada));
    }

    public static String geraSequenciaFibonacci(int input) {
        int x = 1;
        int y = 0;
        String resultado= "";
              
        while(input>=y){
            resultado+= y + ", ";
            x = x+y;
            y = x-y;
        }
        return resultado.substring(0, resultado.length() -2);
    }
}