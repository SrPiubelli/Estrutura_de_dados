/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exercicios.tpi04;

/**
 *
 * @author GABRIELE
 */
import static com.exercicios.tpi04.exer1.calcularDescontoPercentual;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
/* Apenas um teste */

public class TPI04 {
/* Apenas um teste */
    public static void main(String[] args) {
        int opcao;

        do {
            String menu = "Escolha uma opção:\n"
                    + "1 - Calcular valor total de compra (com desconto)\n"
                    + "2 - Calcular saldo atual da conta\n"
                    + "3 - Verificar tipo de triângulo\n"
                    + "4 - Calcular peso ideal\n"
                    + "5 - Calcular imposto do carro (DETRAN)\n"
                    + "6 - Soma da tabuada de 1 a 10\n"
                    + "0 - Sair";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1:
                    calcularCompra();
                    break;
                case 2:
                    calcularSaldo();
                    break;
                case 3:
                    verificarTriangulo();
                    break;
                case 4:
                    calcularPesoIdeal();
                    break;
                case 5:
                    calcularImpostoCarro();
                    break;
                case 6:
                    somaTabuada();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo do programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        } while (opcao != 0);
    }

    // Exercício 1
    public static void calcularCompra() {
        boolean continuar = true;

        while (continuar) {
// Criar campos de entrada
            JTextField campoNome = new JTextField(10);
            JTextField campoPreco = new JTextField(10);
            JTextField campoQuantidade = new JTextField(10);

            // Criar painel para agrupar os inputs em uma única janela
            JPanel painel = new JPanel(new GridLayout(0, 1));
            painel.add(new JLabel("Nome do Produto:"));
            painel.add(campoNome);
            painel.add(new JLabel("Preço do Produto:"));
            painel.add(campoPreco);
            painel.add(new JLabel("Quantidade Comprada:"));
            painel.add(campoQuantidade);

            int resultado = JOptionPane.showConfirmDialog(null, painel,
                    "Cadastro de Compra", JOptionPane.OK_CANCEL_OPTION);

            if (resultado == JOptionPane.OK_OPTION) {
                try {
                    String nomeProduto = campoNome.getText();
                    double preco = Double.parseDouble(campoPreco.getText());
                    int quantidade = Integer.parseInt(campoQuantidade.getText());

                    double subtotal = preco * quantidade;
                    double descontoPercentual = calcularDescontoPercentual(quantidade);
                    double descontoValor = subtotal * descontoPercentual;
                    double valorTotal = subtotal - descontoValor;

                    JOptionPane.showMessageDialog(null,
                            "Produto: " + nomeProduto +
                            "\nQuantidade: " + quantidade +
                            "\nPreço Unitário: R$ " + String.format("%.2f", preco) +
                            "\n---------------------------------" +
                            "\nSubtotal: R$ " + String.format("%.2f", subtotal) +
                            "\nDesconto: " + (int) (descontoPercentual * 100) + "%" +
                            "\nValor do Desconto: R$ " + String.format("%.2f", descontoValor) +
                            "\n---------------------------------" +
                            "\nValor Total a Pagar: R$ " + String.format("%.2f", valorTotal));

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Erro: Digite valores válidos para preço e quantidade.");
                }
            } else {
                // Se o usuário cancelar, sai do loop
                continuar = false;
                break;
            }

            int resposta = JOptionPane.showConfirmDialog(null,
                    "Deseja realizar outra compra?", "Continuar?",
                    JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.NO_OPTION) {
                continuar = false;
            }
    }
    }
    // Exercício 2
    public static void calcularSaldo() {
        boolean continuar = true;

        while (continuar) {
            // Criar os campos
            JTextField campoConta = new JTextField(10);
            JTextField campoSaldo = new JTextField(10);
            JTextField campoDebito = new JTextField(10);
            JTextField campoCredito = new JTextField(10);

            // Criar painel com layout vertical
            JPanel painel = new JPanel(new GridLayout(0, 1));
            painel.add(new JLabel("Número da Conta:"));
            painel.add(campoConta);
            painel.add(new JLabel("Saldo:"));
            painel.add(campoSaldo);
            painel.add(new JLabel("Débito:"));
            painel.add(campoDebito);
            painel.add(new JLabel("Crédito:"));
            painel.add(campoCredito);

            int resultado = JOptionPane.showConfirmDialog(null, painel, 
                    "Informe os dados da conta", JOptionPane.OK_CANCEL_OPTION);

            if (resultado == JOptionPane.OK_OPTION) {
                try {
                    String numeroConta = campoConta.getText();
                    double saldo = Double.parseDouble(campoSaldo.getText());
                    double debito = Double.parseDouble(campoDebito.getText());
                    double credito = Double.parseDouble(campoCredito.getText());

                    // Calcula saldo
                    double saldoAtual = calcularSaldoAtual(saldo, debito, credito);
                    String situacao = (saldoAtual >= 0) ? "Saldo Positivo" : "Saldo Negativo";

                    JOptionPane.showMessageDialog(null, 
                        "Conta: " + numeroConta +
                        "\nSaldo Atual: R$ " + String.format("%.2f", saldoAtual) +
                        "\nSituação: " + situacao);

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Erro: Digite apenas números válidos.");
                }
            } else {
                // Usuário clicou em Cancelar
                continuar = false;
                break;
            }

            int resposta = JOptionPane.showConfirmDialog(null, "Deseja verificar outra conta?",
                    "Continuar?", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.NO_OPTION) {
                continuar = false;
            }
        }
    }

    // Função que calcula o saldo atual
    public static double calcularSaldoAtual(double saldo, double debito, double credito) {
        return saldo - debito + credito;
    }

    // Exercício 3
    public static void verificarTriangulo() {
        boolean continuar = true;

        while (continuar) {
            // Criar campos para os lados
            JTextField campoX = new JTextField(10);
            JTextField campoY = new JTextField(10);
            JTextField campoZ = new JTextField(10);

            // Criar painel para colocar os campos em uma única caixa
            JPanel painel = new JPanel(new GridLayout(0, 1));
            painel.add(new JLabel("Digite o valor de X:"));
            painel.add(campoX);
            painel.add(new JLabel("Digite o valor de Y:"));
            painel.add(campoY);
            painel.add(new JLabel("Digite o valor de Z:"));
            painel.add(campoZ);

            int resultado = JOptionPane.showConfirmDialog(null, painel,
                    "Verificar Triângulo", JOptionPane.OK_CANCEL_OPTION);

            if (resultado == JOptionPane.OK_OPTION) {
                try {
                    double x = Double.parseDouble(campoX.getText());
                    double y = Double.parseDouble(campoY.getText());
                    double z = Double.parseDouble(campoZ.getText());

                    String tipo = verificarTriangulo(x, y, z);

                    JOptionPane.showMessageDialog(null, tipo);

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Erro: Digite apenas números válidos.");
                }
            } else {
                // Usuário clicou em Cancelar
                continuar = false;
                break;
            }

            int resposta = JOptionPane.showConfirmDialog(null, "Deseja verificar outro triângulo?",
                    "Continuar?", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.NO_OPTION) {
                continuar = false;
            }
        }
    }

    // Função que verifica se forma triângulo e retorna o tipo
    public static String verificarTriangulo(double x, double y, double z) {
        // Verifica se forma um triângulo (condição da desigualdade triangular)
        if (x < y + z && y < x + z && z < x + y) {
            if (x == y && y == z) {
                return "É um triângulo EQUILÁTERO (3 lados iguais)";
            } else if (x == y || x == z || y == z) {
                return "É um triângulo ISÓSCELES (2 lados iguais)";
            } else {
                return "É um triângulo ESCALENO (3 lados diferentes)";
            }
        } else {
            return "Os valores informados NÃO formam um triângulo!";
        }
    }

    // Exercício 4
    public static void calcularPesoIdeal() {
         boolean continuar = true;

        while (continuar) {
            // Criar campos de entrada
            JTextField campoAltura = new JTextField(10);
            String[] opcoesSexo = {"Homem", "Mulher"};
            JComboBox<String> comboSexo = new JComboBox<>(opcoesSexo);

            // Criar painel
            JPanel painel = new JPanel(new GridLayout(0, 1));
            painel.add(new JLabel("Informe sua altura (em metros):"));
            painel.add(campoAltura);
            painel.add(new JLabel("Selecione o sexo:"));
            painel.add(comboSexo);

            int resultado = JOptionPane.showConfirmDialog(null, painel, 
                    "Cálculo do Peso Ideal", JOptionPane.OK_CANCEL_OPTION);

            if (resultado == JOptionPane.OK_OPTION) {
                try {
                    double altura = Double.parseDouble(campoAltura.getText());
                    String sexo = (String) comboSexo.getSelectedItem();

                    calcularPesoIdeal(altura, sexo); // Chama a função que exibe o resultado

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Erro: Digite uma altura válida.");
                }
            } else {
                // Usuário cancelou
                continuar = false;
                break;
            }

            int resposta = JOptionPane.showConfirmDialog(null, "Deseja calcular novamente?",
                    "Continuar?", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.NO_OPTION) {
                continuar = false;
            }
        }
    }

    // Função que calcula e mostra o peso ideal (não retorna valor)
    public static void calcularPesoIdeal(double altura, String sexo) {
        double pesoIdeal;

        if (sexo.equals("Homem")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
        }

        JOptionPane.showMessageDialog(null,
                "Sexo: " + sexo +
                "\nAltura: " + altura +
                "\nPeso Ideal: " + String.format("%.2f", pesoIdeal) + " kg");
    }

  
    // Exercício 5
    public static void calcularImpostoCarro() {
       boolean continuar = true;

        while (continuar) {
            // Criar campos para entrada
            JTextField campoAno = new JTextField(10);
            JTextField campoPreco = new JTextField(10);

            JPanel painel = new JPanel(new GridLayout(0, 1));
            painel.add(new JLabel("Digite o ano do carro:"));
            painel.add(campoAno);
            painel.add(new JLabel("Digite o preço do carro:"));
            painel.add(campoPreco);

            int resultado = JOptionPane.showConfirmDialog(null, painel,
                    "Cálculo de Imposto DETRAN", JOptionPane.OK_CANCEL_OPTION);

            if (resultado == JOptionPane.OK_OPTION) {
                try {
                    int ano = Integer.parseInt(campoAno.getText());
                    double preco = Double.parseDouble(campoPreco.getText());

                    double imposto = calcularImposto(ano, preco);
                    double totalComImposto = preco + imposto; // soma do preço + imposto

                    JOptionPane.showMessageDialog(null,
                            "Ano do Carro: " + ano +
                            "\nPreço do Carro: R$ " + String.format("%.2f", preco) +
                            "\nImposto a Pagar: R$ " + String.format("%.2f", imposto) +
                            "\n---------------------------------" +
                            "\nTotal a Pagar: R$ " + String.format("%.2f", totalComImposto));

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Erro: Digite números válidos.");
                }
            } else {
                continuar = false;
                break;
            }

            int resposta = JOptionPane.showConfirmDialog(null, "Deseja calcular outro imposto?",
                    "Continuar?", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.NO_OPTION) {
                continuar = false;
            }
        }
    }

    // Função que retorna o valor do imposto
    public static double calcularImposto(int ano, double preco) {
        double taxa = (ano < 1990) ? 0.01 : 0.015;
        return preco * taxa;
    }

    // Exercício 6
    public static void somaTabuada() {
        boolean continuar = true;

        while (continuar) {
            try {
                String entrada = JOptionPane.showInputDialog("Digite um número para calcular a soma da tabuada:");
                if (entrada == null) break; // usuário cancelou

                int numero = Integer.parseInt(entrada);

                int soma = calcularSomaTabuada(numero);

                JOptionPane.showMessageDialog(null,
                        "Número: " + numero +
                        "\nSoma da Tabuada de 1 até 10 = " + soma);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro: Digite um número válido.");
            }

            int resposta = JOptionPane.showConfirmDialog(null, "Deseja calcular novamente?",
                    "Continuar?", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.NO_OPTION) {
                continuar = false;
            }
        }
    }

    // Função que retorna a soma da tabuada
    public static int calcularSomaTabuada(int numero) {
        int soma = 0;
        for (int i = 1; i <= 10; i++) {
            soma += numero * i;
        }
        return soma;
    }
}
