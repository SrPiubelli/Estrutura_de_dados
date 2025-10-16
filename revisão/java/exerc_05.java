import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite dois inteiros (a b): ");
        if (!sc.hasNextInt()) { System.out.println("Entrada inválida."); return; }
        int a = sc.nextInt();
        if (!sc.hasNextInt()) { System.out.println("Entrada inválida."); return; }
        int b = sc.nextInt();

        int soma = a + b;
        int sub = a - b;
        int mul = a * b;
        int div_int = (b != 0) ? (a / b) : 0;
        double div_real = (b != 0) ? (double)a / b : 0.0;
        int resto = (b != 0) ? a % b : 0;
        double media = (a + b) / 2.0;

        System.out.println("\n--- Aritmética ---");
        System.out.printf("soma = %d\nsub = %d\nmul = %d\ndiv int = %d\ndiv real = %.4f\nresto = %d\nmedia = %.2f\n",
                          soma, sub, mul, div_int, div_real, resto, media);

        System.out.println("\n--- Relacionais ---");
        System.out.println("a > b ? " + (a > b));
        System.out.println("a == b ? " + (a == b));
        System.out.println("Ambos pares? " + (a % 2 == 0 && b % 2 == 0));

        System.out.println("\n--- Decisão ---");
        if (b == 0) System.out.println("b é zero.");
        else if (media >= 10.0) System.out.println("Média >= 10.0");
        else System.out.println("Média < 10.0");

        System.out.println("\n--- Repetições ---");
        System.out.println("Tabela de " + a + " (for 1..5):");
        for (int i = 1; i <= 5; i++) System.out.printf("%d x %d = %d\n", a, i, a * i);

        int temp = b;
        System.out.println("\nContagem regressiva (while):");
        while (temp > 0) {
            System.out.print(temp + " ");
            temp--;
        }
        if (b <= 0) System.out.println("(b <= 0, não entrou no while)");
        else System.out.println();

        temp = 2;
        System.out.println("\nExemplo do/while:");
        do {
            System.out.println("temp = " + temp);
            temp--;
        } while (temp > 0);

        sc.close();
    }
}