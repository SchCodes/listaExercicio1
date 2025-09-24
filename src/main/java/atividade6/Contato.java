public class Contato {
    private String nome;
    private String telefone;
    private String email;

    // Construtor que aceita apenas o nome
    public Contato(String nome) {
        this.nome = nome;
        this.telefone = "";
        this.email = "";
    }

    // Construtor que aceita nome, telefone e email
    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    // Método para exibir detalhes
    public String getDetalhes() {
        return "Nome: " + nome + "\nTelefone: " + telefone + "\nEmail: " + email;
    }
}
