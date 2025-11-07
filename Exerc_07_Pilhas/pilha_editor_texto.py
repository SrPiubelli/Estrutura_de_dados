def menu():
    print("\n=== EDITOR DE TEXTO (PILHA DE AÇÕES) ===")
    print("1 - Adicionar texto")
    print("2 - Desfazer última ação")
    print("3 - Ver texto atual")
    print("4 - Finalizar")

def main():
    pilha_acoes = []  # pilha que guarda o histórico de ações (textos adicionados)
    texto = ""        # texto atual do "editor"

    while True:
        menu()
        opcao = input("Escolha uma opção: ")

        if opcao == "1":
            novo_texto = input("Digite o texto a adicionar: ")
            pilha_acoes.append(texto)  # salva o estado atual antes da mudança
            texto += novo_texto
            print("✅ Texto adicionado com sucesso!")

        elif opcao == "2":
            if len(pilha_acoes) == 0:
                print("⚠️ Nenhuma ação para desfazer.")
            else:
                texto = pilha_acoes.pop()
                print("↩️ Última ação desfeita.")

        elif opcao == "3":
            print("\n📄 Texto atual:")
            print(f"\"{texto}\"" if texto else "(vazio)")

        elif opcao == "4":
            print("\n💾 Edição finalizada. Obrigado por usar o editor!")
            break

        else:
            print("❌ Opção inválida! Tente novamente.")

if __name__ == "__main__":
    main()
