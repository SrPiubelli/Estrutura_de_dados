senha = input("Digite a senha: \n\n")
passe = "1234"
i = 1

if senha == passe:
  print("Senha Correta!")
  print("Parabens!")
  
if senha != passe:
  print("Senha Incorreta!")  
  while i <= 5:
    print("Digite novamente. \n")
    i += 1