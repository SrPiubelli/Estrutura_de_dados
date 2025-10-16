def main():
    try:
        a, b = map(int, input("Digite dois inteiros (a b): ").split())
    except Exception:
        print("Entrada inválida.")
        return

    # Aritmética
    soma = a + b
    sub = a - b
    mul = a * b
    div_int = a // b if b != 0 else None
    div_real = a / b if b != 0 else None
    resto = a % b if b != 0 else None
    media = (a + b) / 2.0

    print("\n--- Aritmética ---")
    print(f"soma = {soma}\nsub = {sub}\nmul = {mul}\ndiv int = {div_int}\ndiv real = {div_real}\nresto = {resto}\nmedia = {media:.2f}")

    # Relacionais
    print("\n--- Relacionais ---")
    print("a > b ?", a > b)
    print("a == b ?", a == b)
    print("Ambos pares?", (a % 2 == 0 and b % 2 == 0))

    # Decisão
    print("\n--- Decisão ---")
    if b == 0:
        print("b é zero (cuidado).")
    elif media >= 10.0:
        print("Média >= 10.0")
    else:
        print("Média < 10.0")

    # Repetição
    print("\n--- Repetições ---")
    print(f"Tabela de {a} (for 1..5):")
    for i in range(1, 6):
        print(f"{a} x {i} = {a * i}")

    temp = b
    print("\nContagem regressiva (while):")
    if temp <= 0:
        print("(b <= 0, não entrou no while)")
    else:
        while temp > 0:
            print(temp, end=' ')
            temp -= 1
        print()

    # Python não tem do/while — simular
    print("\nSimulação do/while (executa pelo menos 1 vez):")
    temp = 2
    while True:
        print("temp =", temp)
        temp -= 1
        if not (temp > 0):
            break

if __name__ == "__main__":
    main()
