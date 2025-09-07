/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade1;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class TesteRetangulo {
    public static void main(String[] args) {
        
        // instacia do scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um inteiro para o valor da base: ");
        int base = scanner.nextInt();
        System.out.println("Digite um inteiro para o valor da altura: ");
        int altura = scanner.nextInt();
        
        
        Retangulo retang = new Retangulo(base, altura);
        
        retang.imprimir();
        retang.mostrarArea();
        retang.mostrarPerimetro();
    }
}
