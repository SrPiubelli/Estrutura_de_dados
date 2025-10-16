// Demo.cs
using System;

class Demo {
    static void Main() {
        Console.Write("Digite dois inteiros (a b): ");
        string[] parts = Console.ReadLine()?.Split();
        if (parts == null || parts.Length < 2) {
            Console.WriteLine("Entrada inválida.");
            return;
        }
        int a = int.Parse(parts[0]);
        int b = int.Parse(parts[1]);

        // Aritmética
        int soma = a + b, sub = a - b, mul = a * b;
        int div_int = (b != 0) ? (a / b) : 0;
        double div_real = (b != 0) ? (double)a / b : 0.0;
        int resto = (b != 0) ? (a % b) : 0;
        double media = (a + b) / 2.0;

        Console.WriteLine("\n--- Aritmética ---");
        Console.WriteLine($"soma = {soma}\nsub = {sub}\nmul = {mul}\ndiv int = {div_int}\ndiv real = {div_real:F4}\nresto = {resto}\nmedia = {media:F2}");

        // Relacionais
        Console.WriteLine("\n--- Relacionais ---");
        Console.WriteLine($"a > b ? { (a > b) }");
        Console.WriteLine($"a == b ? { (a == b) }");
        Console.WriteLine($"Ambos pares? { (a % 2 == 0 && b % 2 == 0) }");

        // Decisão
        Console.WriteLine("\n--- Decisão ---");
        if (b == 0) Console.WriteLine("b é zero (cuidado com divisão).");
        else if (media >= 10.0) Console.WriteLine("Média >= 10.0");
        else Console.WriteLine("Média < 10.0");

        // Repetições
        Console.WriteLine("\n--- Repetições ---");
        Console.WriteLine($"Tabela de {a} (for 1..5):");
        for (int i = 1; i <= 5; i++) Console.WriteLine($"{a} x {i} = {a * i}");

        int temp = b;
        Console.WriteLine("\nContagem regressiva (while):");
        while (temp > 0) {
            Console.Write($"{temp} ");
            temp--;
        }
        if (b <= 0) Console.WriteLine("(b <= 0, não entrou no while)");
        else Console.WriteLine();

        temp = 3;
        Console.WriteLine("\nExemplo do/while:");
        do {
            Console.WriteLine($"temp = {temp}");
            temp--;
        } while (temp > 0);
    }
}