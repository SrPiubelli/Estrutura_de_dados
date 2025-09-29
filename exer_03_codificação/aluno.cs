using System;
class Program {

static void Main() {
        // Solicitação dos valores e conversão de string para inteiro
        int nota = Convert.ToInt32(Console.ReadLine());
        Console.Write("\nDigite a nota do aluno: " + nota);

        if (nota<=5)
        {
        Console.Write("\nReprovado");
        
        }
        
        else if (nota<=6)
        {
        Console.Write("\nRecuperação");
        }
        else {
        Console.Write("\nAprovado");
          
        }

       }
}
