public class Exercicio1 {

    public static void main(String[] args) {
        double teste[] = {40.0, 10.0, 20.0, 80, 10, 60};
        
        System.out.println(geraRecibo(teste));
    }

    public static String geraRecibo(double[] input) {
        double menorValor = 0;
        double arrayAuxiliar[] = new double[input.length/2];
        double valorPagar, valorDesconto = 0.0;
        double valorTotal = 0.0;

        boolean swap= false;
        do { 
            swap= false;
            for (int i =0; i<input.length-1; i++) {
                if (input[i]>input[i+1]) { 
                    double tmp= input[i]; 
                    input[i]=input[i+1];
                    input[i+1]=tmp;
                    swap= true; 
                }
            }
        } while (swap);

        for (int i =0; i<arrayAuxiliar.length; i++){
            arrayAuxiliar[i]=input[i];
            menorValor+=arrayAuxiliar[i];
        }

        for (int i=0; i<input.length; i++){
            valorTotal+=input[i];
        }

        valorDesconto = menorValor*0.5;
        valorPagar = valorTotal-valorDesconto;
        
        String saída = "Valor total: " + valorTotal + " | Valor de descontos: " + valorDesconto + " | Valor a pagar: " + valorPagar;

        return saída;
    }
}