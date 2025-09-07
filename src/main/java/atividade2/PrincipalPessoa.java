package atividade2;

/**
 *
 * @author Ericson, Max
 */

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class PrincipalPessoa {
    public static void main(String[] args) throws UnsupportedEncodingException {
        
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa_1 = new Pessoa("Nulo", 0, 0);

        while (true) {
            System.out.println(
                "\n----------------------- \n" +
                "--- CADASTRO PESSOA --- \n" +
                "----------------------- \n" +
                "1. Cadastrar pessoa \n" +
                "2. Imprimir dados"
            );

            String escolhaStr = scanner.nextLine();

            int escolhaInt;
            try {
                escolhaInt = Integer.parseInt(escolhaStr);
            } catch (NumberFormatException e) {
                System.out.println("\nEntrada inválida! Escolha uma das opções existentes!\n");
                continue;
            }

            switch (escolhaInt) {
                case 1 -> {
                    System.out.println("\nOpção cadastrar pessoa selecionada!\n");
                    
                    // Validação do nome
                    String nome;
                    while (true) {
                        System.out.print("Digite o nome: ");
                        nome = scanner.nextLine();
                        
                        if (nome.matches(".*\\d.*")) {
                            System.out.println("Nome inválido! Não use números.");
                        } else if (nome.isBlank()) {
                            System.out.println("Nome não pode estar vazio!");
                        } else {
                            break;
                        }
                    }   pessoa_1.setNome(nome);
                    
                    // Validação do peso
                    float peso;
                    while (true) {
                        System.out.print("Digite o peso: ");
                        String pesoStr = scanner.nextLine();
                        
                        try {
                            peso = Float.parseFloat(pesoStr.replace(",", "."));
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Peso inválido! Digite apenas números (ex: 75.5).");
                        }
                    }   pessoa_1.setPeso(peso);
                    
                    // Validação da altura
                    float altura;
                    while (true) {
                        System.out.print("Digite a altura: ");
                        String alturaStr = scanner.nextLine();
                        
                        try {
                            altura = Float.parseFloat(alturaStr.replace(",", "."));
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Altura inválida! Digite apenas números (ex: 1.82).");
                        }
                    }   pessoa_1.setAltura(altura);
                    System.out.println("\nPessoa cadastrada com sucesso!\n");
                }
                case 2 -> pessoa_1.imprimir();
                default -> System.out.println("\nOpção inválida!\n");
            }
        }
    }
}
