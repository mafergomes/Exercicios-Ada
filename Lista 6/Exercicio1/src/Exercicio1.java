public class Exercicio1 {

    public static void main(String[] args) {
        double entrada[]= {11, 4.5, 2500.00};
        System.out.println(calculoSalario(entrada));
    }

    public static double calculoSalario(double[] input) {
        double tempoDeServico =input[0];
        double valorInflacao = input[1];
        double salario = input[2];

        if (tempoDeServico>=1 && tempoDeServico<=5) {
            valorInflacao+= 1;
        } else if (tempoDeServico>5 && tempoDeServico<=10) {
            valorInflacao+= 1.5;
        } else if (tempoDeServico>10) {
            valorInflacao+= 2;
        }

        double novoSalario= salario + (salario*(valorInflacao/100));

        return novoSalario;
    }
}