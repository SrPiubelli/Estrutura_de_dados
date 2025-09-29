#include <iostream>
using namespace std;

int main() {
    // Solicitação dos valores 
    int num1, num2;
    cout << "\nDigite o primeiro número: ";
    cin >> num1;

    cout << "\nDigite o segundo número (diferente de zero): ";
    cin >> num2;

    // Declaração das variáveis para armazenar os resultados
    int soma, sub, mult;
    float div;

    // Realização dos cálculos dos dois números
    soma = num1 + num2;
    sub = num1 - num2;
    mult = num1 * num2;
    div = (float)num1 / (float)num2;

    // Exibição dos resultados das operações ao final
    cout << "\nResultados:";
    cout << "\nSoma: " << soma;
    cout << "\nSubtração: " << sub;
    cout << "\nMultiplicação: " << mult;
    cout << "\nDivisão: " << div ;

    return 0;
}
