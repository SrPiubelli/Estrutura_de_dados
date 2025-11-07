def menu():
    print("\n=== MONTAGEM DE SANDUÍCHE ===")
    print("1 - Adicionar ingrediente")
    print("2 - Remover ingrediente (do topo)")
    print("3 - Ver último ingrediente adicionado")
    print("4 - Mostrar sanduíche")
    print("5 - Finalizar pedido")

def main():
    pilha = []  # a pilha que representa o sanduíche

    while True:
        menu()
        opcao = input("Escolha uma opção: ")

        if opcao == "1":
            ingrediente = input("Informe o ingrediente a adicionar: ")
            pilha.append(ingrediente)
            print(f"✅ Ingrediente '{ingrediente}' adicionado ao topo do sanduíche.")

        elif opcao == "2":
            if len(pilha) == 0:
                print("⚠️ O sanduíche está vazio. Nada para remover.")
            else:
                removido = pilha.pop()
                print(f"🗑️ Ingrediente removido: {removido}")

        elif opcao == "3":
            if len(pilha) == 0:
                print("🍞 O sanduíche está vazio.")
            else:
                print(f"🔝 Último ingrediente adicionado: {pilha[-1]}")

        elif opcao == "4":
            if len(pilha) == 0:
                print("🥖 Ainda não há ingredientes no sanduíche.")
            else:
                print("\n🍔 Seu sanduíche (de baixo para o topo):")
                for i, ing in enumerate(pilha):
                    print(f"{i+1}. {ing}")

        elif opcao == "5":
            print("\n🍽️ Pedido finalizado! Bom apetite! 😋")
            break

        else:
            print("❌ Opção inválida! Tente novamente.")

if __name__ == "__main__":
    main()
