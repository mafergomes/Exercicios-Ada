import java.util.*;
import java.io.*;

public class JogoDaForca {
    public static void main(String[] args) throws Exception {
        Console c = System.console();
        Scanner s = new Scanner(System.in);
        System.out.println("Seja bem vindo ao Jogo da Forca! Tente acertar a palavra em 5 tentativas.");
        System.out.println();
        System.out.print("Digite o tema da palavra: ");
        String tema = s.nextLine();

        char[] palavraDigitada = c.readPassword("Digite a palavra para iniciar o jogo: ");

        char [] arrayAuxiliar = new char[palavraDigitada.length];
        System.out.println("A quantidade de letras da palavra é: ");
        for(int i=0; i<palavraDigitada.length; i++){
            arrayAuxiliar[i]= '_';
            System.out.print(arrayAuxiliar[i] + " ");
        }
        System.out.println();

        palpite(c);

        int erros=5;
        boolean fimDeJogo = false;

        while (!fimDeJogo){
            boolean palpite=false;
            for (int i=0; i<palavraDigitada.length; i++){
                if (palavraDigitada[i]==palpite(c)){
                    arrayAuxiliar[i]=palpite(c); 
                    palpite= true;                   
                }
            }

            if (palpite){
                System.out.println("Você acertou o palpite!");
            } else {
                erros--;
                if (erros>0){
                    System.out.println("Você errou o palpite. Tente novamente. Você tem mais "+erros+ " tentativas");
                } else if (erros==0) {
                    System.out.println("Você não tem mais tentativas. Fim de jogo.");
                    printLn(palavraDigitada);
                    break;
                }        
            }
            
            printLn(arrayAuxiliar);

            if (Arrays.equals(palavraDigitada, arrayAuxiliar)){
                System.out.println("Você acertou a palavra! Fim de jogo.");
                fimDeJogo = true;
            } else {
                palpite(c);
            }
        }
        s.close();
    }
    static void printLn(char[] teste){
        for (int i=0; i<teste.length; i++){
            System.out.print(teste[i]);
        }
        System.out.println();
    } 
    
    static char palpite(Console console) throws Exception {
        System.out.println("Digite uma letra: ");
        String entrada = console.readLine();
        //ultima condição é um regex
        if(entrada.isEmpty() || entrada.length()>1 || !entrada.matches("^[a-zA-z]*$")){
            throw new Exception("É obrigatorio informar uma letra. Tente novamente");
        }    
        return entrada.charAt(0);
    }
}
