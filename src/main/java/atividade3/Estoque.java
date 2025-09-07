package atividade3;

/**
 *
 * @author Ericson, Max
 */
public class Estoque {
    
    // Atributos
    private String nomeProduto;
    private double valor;
    private int quantidade;

    // Construtor vazio
    public Estoque() {
    }

    // Construtor com parâmetros
    public Estoque(String nomeProduto, double valor, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    // Métodos getters e setters (encapsulamento)
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método imprimir
    public void imprimir() {
        System.out.println(
                "\n==============================" +
                "\nProduto: " + nomeProduto +
                "\nValor: R$ " + valor +
                "\nQuantidade em estoque: " + quantidade +
                "\n=============================="
        );
    }

    // Método verificarDisponibilidade
    public boolean verificarDisponibilidade(int quantidadeSolicitada) {
        return (quantidade > 0 && quantidade >= quantidadeSolicitada);
    }

    // Método removerProdutos
    public void removerProdutos(int quantidadeRemover) {
        if (verificarDisponibilidade(quantidadeRemover)) {
            quantidade -= quantidadeRemover;
            System.out.println("\n✅ " + quantidadeRemover + " unidade(s) removida(s) do produto " + nomeProduto + ".");
        } else {
            System.out.println("Você tentou remover " + quantidadeRemover + " itens.");
            System.out.println("\n❌ Não há estoque suficiente do produto " + nomeProduto + ".");
        }
    }
}