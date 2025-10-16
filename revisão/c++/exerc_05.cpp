// demo.cpp
#include <iostream>
using namespace std;

int main() {
    int a, b;
    cout << "Digite dois inteiros (a b): ";
    if (!(cin >> a >> b)) {
        cerr << "Entrada inválida.\n";
        return 1;
    }

    // Aritmética
    int soma = a + b, sub = a - b, mul = a * b;
    int div_int = (b != 0) ? (a / b) : 0;
    double div_real = (b != 0) ? (double(a) / double(b)) : 0.0;
    int resto = (b != 0) ? (a % b) : 0;
    double media = (a + b) / 2.0;

    cout << "\n--- Aritmética ---\n";
    cout << "soma = " << soma << "\nsub = " << sub << "\nmul = " << mul
         << "\ndiv int = " << div_int << "\ndiv real = " << div_real
         << "\nresto = " << resto << "\nmedia = " << media << "\n";

    // Relacionais
    cout << "\n--- Relacionais ---\n";
    cout << boolalpha;
    cout << "a > b ? " << (a > b) << "\na < b ? " << (a < b)
         << "\na == b ? " << (a == b) << "\na != b ? " << (a != b) << "\n";
    cout << "Ambos pares? " << ((a % 2 == 0) && (b % 2 == 0)) << "\n";

    // Decisão
    cout << "\n--- Decisão ---\n";
    if (b == 0) cout << "b é zero (não dividir!).\n";
    else if (media >= 10.0) cout << "Média >= 10.0\n";
    else cout << "Média < 10.0\n";

    if (a > 0) {
        if (b > 0) cout << "Ambos positivos.\n";
        else cout << "Somente a é positivo.\n";
    } else cout << "a não é positivo.\n";

    // Repetições
    cout << "\n--- Repetições ---\n";
    cout << "Tabela de " << a << " (for 1..5):\n";
    for (int i = 1; i <= 5; ++i) cout << a << " x " << i << " = " << a * i << "\n";

    int temp = b;
    cout << "\nContagem regressiva (while):\n";
    while (temp > 0) {
        cout << temp << " ";
        --temp;
    }
    if (b <= 0) cout << "(b <= 0, não entrou no while)\n";
    else cout << "\n";

    temp = 2;
    cout << "\nExemplo do/while:\n";
    do {
        cout << "temp = " << temp << "\n";
        --temp;
    } while (temp > 0);

    return 0;
}