package atividade4;

public class Data {
    private int dia;
    private int mes; // como inteiro
    private int ano;

    private static final String[] MESES = {
        "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
    };

    private static final int[] DIAS_MES = { 31, 28, 31, 30, 31, 30,
                                            31, 31, 30, 31, 30, 31 };

    // Construtor 1: dia, mês, ano (todos inteiros)
    public Data(int dia, int mes, int ano) {
        this.ano = ano;
        this.mes = (mes >= 1 && mes <= 12) ? mes : 1;
        this.dia = (dia >= 1 && dia <= diasNoMes(this.mes, ano)) ? dia : 1;
    }

    // Construtor 2: dia, mês por extenso, ano
    public Data(int dia, String mesExtenso, int ano) {
        this.ano = ano;
        this.mes = mesStringParaInt(mesExtenso);
        this.dia = (dia >= 1 && dia <= diasNoMes(this.mes, ano)) ? dia : 1;
    }

    // Construtor 3: dias do ano e ano
    public Data(int diasDoAno, int ano) {
        this.ano = ano;
        int restanteDias = diasDoAno;
        int m = 0;
        while (m < 12) {
            int diasNoMesAtual = DIAS_MES[m];
            if (m == 1 && isBissexto(ano)) diasNoMesAtual++; // Fevereiro bissexto

            if (restanteDias <= diasNoMesAtual) {
                this.mes = m + 1;
                this.dia = restanteDias;
                break;
            } else {
                restanteDias -= diasNoMesAtual;
            }
            m++;
        }

        // Se ultrapassou o ano, define última data válida
        if (m == 12) {
            this.mes = 12;
            this.dia = 31;
        }
    }

    // Getters e Setters
    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAno() { return ano; }

    public void setDia(int dia) { if (dia >= 1 && dia <= diasNoMes(this.mes, this.ano)) this.dia = dia; }
    public void setMes(int mes) { if (mes >= 1 && mes <= 12) this.mes = mes; }
    public void setAno(int ano) { this.ano = ano; }

    // Verifica se o ano é bissexto
    public static boolean isBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    // Converte mês por extenso para inteiro
    private int mesStringParaInt(String mesExtenso) {
        for (int i = 0; i < MESES.length; i++) {
            if (MESES[i].equalsIgnoreCase(mesExtenso)) return i + 1;
        }
        return 1; // default janeiro
    }

    // Dias do mês considerando bissexto
    private int diasNoMes(int mes, int ano) {
        int dias = DIAS_MES[mes - 1];
        if (mes == 2 && isBissexto(ano)) dias++;
        return dias;
    }

    // Calcula o dia do ano (DDD) corretamente
    private int calcularDiaDoAno() {
        int total = dia;
        for (int i = 0; i < mes - 1; i++) {
            total += DIAS_MES[i];
            if (i == 1 && isBissexto(ano)) total++; // adiciona 1 dia se fevereiro e bissexto
        }
        return total;
    }

    // Imprime nos três formatos
    public void imprimir() {
        System.out.printf("Formato 1: %02d/%02d/%04d%n", dia, mes, ano);
        System.out.printf("Formato 2: %02d de %s de %04d%n", dia, MESES[mes - 1], ano);
        System.out.printf("Formato 3: %03d %04d%n", calcularDiaDoAno(), ano);
    }
}
