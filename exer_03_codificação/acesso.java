import java.util.Scanner;

public class Main {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        String cod;
        System.out.print("\nDigite o codigo de acesso");
        cod = scanner.next();
        
        if (cod.equals("Admin123")) // Correto: Compara se o conteúdo de 'cod' é igual a "Admin123"
        {
            System.out.println("\n✅ Bem vindo, ADM");
        }
        else if (cod.equals("User123")) // Correto: Compara se o conteúdo de 'cod' é igual a "User123"
        {
            System.out.println("\n✅ Bem vindo, User");
        }
        else {
            System.out.println("\n❌ Código incorreto");
        }

        scanner.close();
    }
}
