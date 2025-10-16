/* demo.c
   Demonstra operadores aritméticos, relacionais, decisões e repetições.
*/
#include <stdio.h>

int main() {
    int a, b, i;
    printf("Digite dois inteiros (a b): ");
    if (scanf("%d %d", &a, &b) != 2) {
        printf("Entrada inválida.\n");
        return 1;
    }

    // OPERADORES ARITMÉTICOS
    int soma = a + b;
    int sub = a - b;
    int mul = a * b;
    int div_int = (b != 0) ? (a / b) : 0; // evitar divisão por zero
    double div_real = (b != 0) ? ((double)a / (double)b) : 0.0;
    int resto = (b != 0) ? (a % b) : 0;
    double media = (a + b) / 2.0;

    printf("\n--- Aritmética ---\n");
    printf("soma = %d\nsub = %d\nmul = %d\ndiv int = %d\ndiv real = %.4f\nresto = %d\nmedia = %.2f\n",
           soma, sub, mul, div_int, div_real, resto, media);

    // OPERADORES RELACIONAIS
    printf("\n--- Relacionais ---\n");
    printf("a > b ? %s\n", (a > b) ? "true" : "false");
    printf("a < b ? %s\n", (a < b) ? "true" : "false");
    printf("a == b ? %s\n", (a == b) ? "true" : "false");
    printf("a != b ? %s\n", (a != b) ? "true" : "false");
    printf("a >= b ? %s\n", (a >= b) ? "true" : "false");
    printf("a <= b ? %s\n", (a <= b) ? "true" : "false");

    // combinações
    printf("Ambos pares? %s\n", ( (a % 2 == 0) && (b % 2 == 0) ) ? "true" : "false");

    // COMANDOS DE DECISÃO
    printf("\n--- Decisão ---\n");
    if (b == 0) {
        printf("Nota: b é zero -> cuidado com divisão.\n");
    } else if (media >= 10.0) {
        printf("Média >= 10.0: média = %.2f\n", media);
    } else {
        printf("Média < 10.0: média = %.2f\n", media);
    }

    // exemplo aninhado
    if (a > 0) {
        if (b > 0) {
            printf("Ambos positivos.\n");
        } else {
            printf("Somente a é positivo.\n");
        }
    } else {
        printf("a não é positivo.\n");
    }

    // COMANDOS DE REPETIÇÃO
    printf("\n--- Repetições ---\n");
    // for: tabela de multiplicação de a até 5
    printf("Tabela de %d (for 1..5):\n", a);
    for (i = 1; i <= 5; ++i) {
        printf("%d x %d = %d\n", a, i, a * i);
    }

    // while: decrementar b até zero (mostra estado)
    int temp = b;
    printf("\nContagem regressiva de b até 0 (while):\n");
    while (temp > 0) {
        printf("%d ", temp);
        temp--;
    }
    if (b <= 0) printf("(b <= 0, não entrou no while)\n");
    else printf("\n");

    // do/while: executa pelo menos uma vez (exemplo)
    temp = 3;
    printf("\nExemplo do/while (executa 3 vezes):\n");
    do {
        printf("Executando: temp=%d\n", temp);
        temp--;
    } while (temp > 0);

    return 0;
}