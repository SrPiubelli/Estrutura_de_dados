palavra = input("Escreva uma palavra: ")

vogais = "aeiouAEIOUàáÁÀãÃÂâèéÉÈêÊíìÍÌÚÙúùõÕÔôóÓòÒ"

contador = 0

for letra in palavra:
    if letra in vogais:
        contador += 1

print("Total de vogais nesta palavra é:", contador)
