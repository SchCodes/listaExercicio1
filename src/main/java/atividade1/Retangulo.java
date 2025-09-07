package atividade1;

/**
 *
 * @author Ericson, Max
 */

public class Retangulo {
    
    private int base;
    private int altura;
    
    public Retangulo(int a, int b ){
        this.base = a;
        this.altura = b;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void imprimir(){
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
    }
    
    public void mostrarArea(){
        int area = base * altura;
        System.out.println("Area: " + area);
    }
    
    public void mostrarPerimetro(){
        int perimetro = 2*base + 2*altura;
        System.out.println("Perímetro: " + perimetro);
    }
}
