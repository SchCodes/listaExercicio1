import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GerenciadorContatos extends JFrame {
    private JTextField campoNome, campoTelefone, campoEmail;
    private JTextArea areaDetalhes;
    private Contato contato; // Armazena o último contato adicionado

    public GerenciadorContatos() {
        super("Gerenciador de Contatos");

        // Layout
        setLayout(new BorderLayout());

        // Painel de entrada de dados
        JPanel painelEntrada = new JPanel(new GridLayout(3, 2));
        painelEntrada.add(new JLabel("Nome:"));
        campoNome = new JTextField();
        painelEntrada.add(campoNome);

        painelEntrada.add(new JLabel("Telefone:"));
        campoTelefone = new JTextField();
        painelEntrada.add(campoTelefone);

        painelEntrada.add(new JLabel("Email:"));
        campoEmail = new JTextField();
        painelEntrada.add(campoEmail);

        // Botões
        JPanel painelBotoes = new JPanel();
        JButton btnAdicionar = new JButton("Adicionar Contato");
        JButton btnMostrar = new JButton("Mostrar Detalhes");
        painelBotoes.add(btnAdicionar);
        painelBotoes.add(btnMostrar);

        // Área de detalhes
        areaDetalhes = new JTextArea(10, 30);
        areaDetalhes.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaDetalhes);

        // Adiciona os componentes na janela
        add(painelEntrada, BorderLayout.NORTH);
        add(painelBotoes, BorderLayout.CENTER);
        add(scroll, BorderLayout.SOUTH);

        // Ações dos botões
        btnAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = campoNome.getText().trim();
                String telefone = campoTelefone.getText().trim();
                String email = campoEmail.getText().trim();

                if (nome.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "O nome é obrigatório!");
                    return;
                }

                if (telefone.isEmpty() && email.isEmpty()) {
                    contato = new Contato(nome); // usa o construtor com apenas nome
                } else {
                    contato = new Contato(nome, telefone, email);
                }

                JOptionPane.showMessageDialog(null, "Contato adicionado com sucesso!");
                campoNome.setText("");
                campoTelefone.setText("");
                campoEmail.setText("");
            }
        });

        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (contato == null) {
                    JOptionPane.showMessageDialog(null, "Nenhum contato adicionado ainda!");
                } else {
                    areaDetalhes.setText(contato.getDetalhes());
                }
            }
        });

        // Configurações da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GerenciadorContatos();
    }
}
