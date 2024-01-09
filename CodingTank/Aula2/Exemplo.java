import java.util.Scanner;

public class Exemplo {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //String teste = s.nextLine();
        System.out.println("digite um numero");
        int a = s.nextInt();
        //System.out.println(teste);
        //System.out.println(a);
        String valor = "";
        
        //nos cases, só é aceito constantes e literais ("escrito assim")
        switch (a){
            case 0 : valor = "Zero"; break;
            case 1 : valor = "Um"; break;
            case 2 : valor = "Dois"; break;
            default : valor = "Valor invalido"; break; //equivalente ao else
            //precisa do break em todos os case pq se não todos os cases são executados
        }
        System.out.println(valor);
        s.close();

        //enum TamanhoCafe {Pequeno, Medio, Grande}; //lista de valores constantes

        


    }
}
