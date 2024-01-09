import java.util.Scanner;
public class Prova {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double aux=0;
        double salarioV[]=new double[5];
        double descINSS[]=new double[5];
        double descIDR[]=new double[5];
        double salarioL[]=new double[5];
        int cont =1;

        for (int i=0; i<5; i++){
            System.out.printf("Digite o salário do funcionário %d(em reais): ", cont);
            salarioV[i]= s.nextDouble();
            cont++;
        }
            
        for (int i=0; i<5; i++) {
            //Desconto INSS
            if(salarioV[i]<=1212.00){
                descINSS[i]= salarioV[i]/100*7.5;
            } else if (salarioV[i]>=1212.01 && salarioV[i]<=2427.35) {
                aux=salarioV[i]-1212.01;
                descINSS[i]= (1212.00/100*7.5) + (aux/100*9);
            } else if (salarioV[i]>=2427.36 && salarioV[i]<=3641.03) {
                aux=salarioV[i]-2427.36;
                descINSS[i]= (1212.00/100*7.5) + (1215.34/100*9) + (aux/100*12);
            } else if (salarioV[i]>=3641.04 && salarioV[i]<=7087.22) {
                aux=salarioV[i]-3641.04;
                descINSS[i]= (1212.00/100*7.5) + (1215.34/100*9) + (1213.67/100*12) + (aux/100*14);
            } else if (salarioV[i]>=7087.22){
                descINSS[i]= (1212.00/100*7.5) + (1215.34/100*9) + (1213.67/100*12) + (3446.18/100*14);
            }

            //Desconto Imposto de Renda
            if (salarioV[i]>1903.99 && salarioV[i]<2826.65) {
                descIDR[i]= (salarioV[i]/100*7.5);
            } else if (salarioV[i]>2826.66 && salarioV[i]<3751.05) {
                aux=salarioV[i]-2826.66;
                descIDR[i]= (1903.99/100*7.5) + (aux/100*15);
            } else if (salarioV[i]>3751.06 && salarioV[i]<4664.68) {
                aux=salarioV[i]-3751.06;
                descIDR[i]= (1903.99/100*7.5) + (924.39/100*15) + (aux/100*22.5);
            } else if (salarioV[i]>4664.68){
                descIDR[i]= (1903.99/100*7.5) + (924.39/100*15) + (913.62/100*22.5);
            }
            salarioL[i]= salarioV[i]-descIDR[i]-descINSS[i];
        }
        
        cont=1;
        for (int i=0; i<5; i++){
            System.out.printf("Informações do funcionário %d:\n", cont);
            System.out.printf("Salário bruto: %.2f\n", salarioV[i]);
            System.out.printf("Valor pago no INSS: %.2f\n", descINSS[i]);
            System.out.printf("Valor pago no Imposto de Renda: %.2f\n", descIDR[i]);
            System.out.printf("Salário líquido: %.2f\n", salarioL[i]);
            System.out.println();
            cont++;
        }
        s.close();
    }
}
