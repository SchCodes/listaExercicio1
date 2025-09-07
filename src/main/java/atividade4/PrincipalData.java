package atividade4;

import java.io.UnsupportedEncodingException;

public class PrincipalData {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));

        System.out.println("Construtor 1: Data(dia, mes, ano)");
        Data data1 = new Data(23, 3, 2017);
        data1.imprimir();

        System.out.println("\nConstrutor 2: Data(dia, mesExtenso, ano)");
        Data data2 = new Data(23, "Março", 2017);
        data2.imprimir();

        System.out.println("\nConstrutor 3: Data(diasDoAno, ano)");
        Data data3 = new Data(82, 2017); // 23 de Março = 82º dia do ano
        data3.imprimir();

        System.out.println("\nTeste ano bissexto: 29 de Fevereiro de 2024");
        Data data4 = new Data(29, "Fevereiro", 2024);
        data4.imprimir();
        
        System.out.println("\nTeste ano bissexto: 29 de Fevereiro de 2024");
        Data data5 = new Data(61, 2024);
        data5.imprimir();
    }
}
