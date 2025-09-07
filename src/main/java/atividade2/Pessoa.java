/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade2;

/**
 *
 * @author floyd_win
 */
public class Pessoa {
    
    private String nome;
    private float peso;
    private float altura;
    
    public Pessoa(String n, float p, float a){
        this.nome = n;
        this.peso = p;
        this.altura = a;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void imprimir(){
        System.out.println("\nNome: " + nome);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura + "\n");
    }
}
