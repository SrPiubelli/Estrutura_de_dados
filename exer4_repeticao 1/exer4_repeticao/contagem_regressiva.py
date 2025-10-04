numero = int(input("Digite um número inteiro positivo: "))

if numero < 0:
  print ("Número inválido. Por favor, digite um número inteiro POSITIVO.")
else:
  print("Contagem regressiva: ")
  while numero >= 0:
      print(numero)
      numero -= 1 