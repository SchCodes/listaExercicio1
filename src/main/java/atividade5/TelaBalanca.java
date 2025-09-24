package restaurante;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaBalanca extends JFrame {

    private JTextField txtTara;
    private JTextField txtPesoTotal;
    private JTextField txtValorKg;
    private JLabel lblValorKg;
    private JLabel lblPesoAlimento;
    private JLabel lblValorPrato;
    private JButton btnCalcular;

    public TelaBalanca() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Balança - Restaurante por Quilo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 350);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Painel de entrada
        JPanel painelEntrada = new JPanel(new GridLayout(3, 2, 10, 10));
        painelEntrada.setBorder(BorderFactory.createTitledBorder("Dados do Cliente"));

        painelEntrada.add(new JLabel("Tara do prato (g):"));
        txtTara = new JTextField();
        painelEntrada.add(txtTara);

        painelEntrada.add(new JLabel("Peso total (g):"));
        txtPesoTotal = new JTextField();
        painelEntrada.add(txtPesoTotal);

        painelEntrada.add(new JLabel("Valor por Kg (R$):"));
        txtValorKg = new JTextField();
        painelEntrada.add(txtValorKg);

        // Painel de resultados
        JPanel painelResultados = new JPanel(new GridLayout(3, 1, 5, 5));
        painelResultados.setBorder(BorderFactory.createTitledBorder("Resultados"));

        lblValorKg = new JLabel("Valor por Kg: -");
        lblPesoAlimento = new JLabel("Peso alimento: -");
        lblValorPrato = new JLabel("Valor prato: -");

        painelResultados.add(lblValorKg);
        painelResultados.add(lblPesoAlimento);
        painelResultados.add(lblValorPrato);

        // Botão calcular
        btnCalcular = new JButton("Calcular");
        btnCalcular.setBackground(new Color(0, 128, 64));
        btnCalcular.setForeground(Color.WHITE);
        btnCalcular.setFont(new Font("Arial", Font.BOLD, 14));
        btnCalcular.setFocusPainted(false);

        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                calcularAction();
            }
        });

        // Painel do botão centralizado
        JPanel painelBotao = new JPanel();
        painelBotao.add(btnCalcular);

        // Adicionar tudo ao JFrame
        add(painelEntrada, BorderLayout.NORTH);
        add(painelBotao, BorderLayout.CENTER);
        add(painelResultados, BorderLayout.SOUTH);
    }

    private void calcularAction() {
        try {
            double tara = Double.parseDouble(txtTara.getText());
            double peso = Double.parseDouble(txtPesoTotal.getText());
            double valorKg = Double.parseDouble(txtValorKg.getText());

            Balanca balanca = new Balanca(tara, peso, valorKg);

            lblValorKg.setText("Valor por Kg: R$ " + String.format("%.2f", balanca.mostrarValorKg()));
            lblPesoAlimento.setText("Peso alimento: " + String.format("%.0f", balanca.calcularPesoAlimento()) + " g");
            lblValorPrato.setText("Valor prato: R$ " + String.format("%.2f", balanca.calcularValorPrato()));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Digite valores numéricos válidos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método principal
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaBalanca().setVisible(true));
    }
}
