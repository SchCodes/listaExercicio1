/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade3;

/**
 *
 * @author floyd_win
 */
public class Estoque {
    
    private String nomeProduto;
    private float valor;
    private int quantidade;
    
    public Estoque(String n, float v, int q) {
        this.nomeProduto = n;
        this.valor = v;
        this.quantidade = q;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void imprimir(){
        System.out.println(
                "Nome produto: " + nomeProduto + 
                "\nValor: " + valor +
                "\nQuantidade: " + quantidade
        );
        
    public boolean verificarDisponibilidade(int n) {
        
    };
        
    }
    
    
}
