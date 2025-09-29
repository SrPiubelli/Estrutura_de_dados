#include <iostream> // Inclui a biblioteca para entrada e saída
using namespace std;
int main() {
  //variaveis
    int valor;
    cin >> valor; 
    cout << "Digite o Valor da Compra: "<< valor;
    
    if(valor>=100)
    {
          cout << "\nVocê recebeu frete grátis";
          cout << "\nValor Final: "<< valor;

    }
    else
    {
        int soma;
        soma=valor+=15;
          cout << "\nVocê recebeu frete";
          cout << "\nValor Final: "<< soma;


    }
    return 0;}