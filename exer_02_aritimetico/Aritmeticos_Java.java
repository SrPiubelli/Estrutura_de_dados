import java.util.Scanner;
public class Main {
public static void main(String[] args) {
        // Criação do objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitação dos valores
        int num1, num2;
        System.out.print("\nDigite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.print("\nDigite o segundo número (diferente de zero): ");
        num2 = scanner.nextInt();

        // Declaração das variáveis para armazenar os resultados
        int soma, sub, mult;
        float div;

        // Realização dos cálculos dos dois números
        soma = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = (float) num1 / (float) num2;

        // Exibição dos resultados das operações ao final
        System.out.println("\nResultados:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mult);
        System.out.printf("Divisão: " + div);

        scanner.close();
    }
}
