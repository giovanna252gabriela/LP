import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {

    private JFrame frame;
    private JTextField textField;

    private double numeroAnterior;
    private String operacaoAtual;
    private boolean limparCampo;

    public Calculadora() {
        frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField();
        textField.setEditable(false);

        JPanel panel = new JPanel(new GridLayout(4, 4));

        String[] botoes = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                ".", "0", "=", "+"
        };

        for (String textoBotao : botoes) {
            JButton botao = new JButton(textoBotao);

            botao.addActionListener(new ActionListener() {
                @Override

                public void actionPerformed(ActionEvent e) {
                    if (limparCampo) {
                        textField.setText("");
                        limparCampo = false;
                    }

                    String texto = textField.getText();
                    String botaoTexto = botao.getText();

                    if (botaoTexto.matches("[0-9.]")) {
                        textField.setText(texto + botaoTexto);
                    } else if (botaoTexto.equals("=")) {
                        double resultado = calcular();
                        textField.setText(String.valueOf(resultado));
                        limparCampo = true;
                    } else {
                        numeroAnterior = Double.parseDouble(texto);
                        operacaoAtual = botaoTexto;
                        limparCampo = true;
                    }
                }
            });

            panel.add(botao);
        }

        frame.getContentPane().add(textField, "North");
        frame.getContentPane().add(panel, "Center");

        frame.pack();
        frame.setVisible(true);
    }

    public double calcular() {
        double numeroAtual = Double.parseDouble(textField.getText());
        double resultado = 0.0;

        switch (operacaoAtual) {
            case "+":
                resultado = numeroAnterior + numeroAtual;
                break;
            case "-":
                resultado = numeroAnterior - numeroAtual;
                break;
            case "*":
                resultado = numeroAnterior * numeroAtual;
                break;
            case "/":
                resultado = numeroAnterior / numeroAtual;
                break;
        }

        return resultado;
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}