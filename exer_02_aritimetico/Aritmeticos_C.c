#include <stdio.h>

int main() {
    // Solicitação dos valores
    int num1, num2;
    printf("\nDigite o primeiro número: ");
    scanf("%d", &num1);

    printf("\nDigite o segundo número (diferente de zero): ");
    scanf("%d", &num2);

    // Declaração das variáveis para armazenar os resultados
    int soma, sub, mult;
    float div;

    // Realização dos cálculos dos dois números
    soma = num1 + num2;
    sub = num1 - num2;
    mult = num1 * num2;
    div = (float)num1 / (float)num2;

    // Exibição dos resultados das operações ao final
    printf("\nResultados:");
    printf("\nSoma: %d", soma);
    printf("\nSubtração: %d", sub);
    printf("\nMultiplicação: %d", mult);
    printf("\nDivisão: %.2f", div);

    return 0;
}
