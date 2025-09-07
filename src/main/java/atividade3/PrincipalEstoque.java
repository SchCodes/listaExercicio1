/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade3;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author floyd_win
 */
public class PrincipalEstoque {
    public static void main(String[] args) throws UnsupportedEncodingException {
        
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));

        // Criando objeto vazio
        Estoque produto = new Estoque();

        // Atribuindo valores usando setters
        produto.setNomeProduto("Notebook");
        produto.setValor(3500.00); // double
        produto.setQuantidade(10);

        // Imprime dados iniciais
        produto.imprimir();

        // Teste de remoção
        produto.removerProdutos(3); // Remove 3 unidades
        produto.imprimir();

        produto.removerProdutos(8); // Tenta remover mais que disponível
        produto.imprimir();

        // Alterando valores do produto
        System.out.println("Alterando os valores do produto:");
        produto.setNomeProduto("Mouse Gamer");
        produto.setValor(150.00);
        produto.setQuantidade(5);

        // Imprime dados atualizados
        produto.imprimir();

        // Teste de remoção novamente
        produto.removerProdutos(2);
        produto.imprimir();
    }
}