from collections import deque
import time

def menu():
    print("\n=== FILA DE IMPRESSÃO ===")
    print("1 - Adicionar arquivo à fila")
    print("2 - Imprimir próximo arquivo")
    print("3 - Mostrar fila de impressão")
    print("4 - Sair")

fila_impressao = deque()

while True:
    menu()
    opcao = input("Escolha uma opção: ")

    if opcao == "1":
        arquivo = input("Digite o nome do arquivo: ").strip()
        if arquivo:
            fila_impressao.append(arquivo)
            print(f"Arquivo '{arquivo}' adicionado à fila.")
        else:
            print("Nome de arquivo inválido.")

    elif opcao == "2":
        if fila_impressao:
            proximo = fila_impressao.popleft()
            print(f"Imprimindo '{proximo}'...")
            time.sleep(2)
            print(f"Arquivo '{proximo}' impresso com sucesso!")
        else:
            print("Nenhum arquivo na fila para imprimir.")

    elif opcao == "3":
        if fila_impressao:
            print("\nArquivos na fila:")
            for i, arquivo in enumerate(fila_impressao, start=1):
                print(f"{i}. {arquivo}")
        else:
            print("A fila de impressão está vazia.")

    elif opcao == "4":
        print("Encerrando o programa de impressão...")
        break

    else:
        print("Opção inválida! Tente novamente.")
