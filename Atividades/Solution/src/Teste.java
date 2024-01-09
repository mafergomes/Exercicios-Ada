import java.io.Console;

public class Teste {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.out.println("Console indisponível. Não é possível ocultar a entrada.");
            System.exit(1);
        }

        char[] senhaChars = console.readPassword("Digite sua senha: ");
        String senha = new String(senhaChars);

        // Você pode fazer o que quiser com a senha aqui
        System.out.println("Senha digitada: " + senha);

        // Limpar a referência para a senha
        java.util.Arrays.fill(senhaChars, ' ');
    }
}
    
