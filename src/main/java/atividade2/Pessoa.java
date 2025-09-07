package atividade2;

/**
 *
 * @author Ericson, Max
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
