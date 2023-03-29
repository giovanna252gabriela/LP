import java.awt.Container;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class AluguelDeVeiculos extends JFrame {
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        AluguelDeVeiculos field = new AluguelDeVeiculos();
        field.testaJFormattedTextField();
    }
    private void testaJFormattedTextField() {
        Container janela = getContentPane();
        setLayout(null);

        JLabel labelTel = new JLabel("Telefone: ");
        JLabel labelCpf = new JLabel("CPF: ");
        JLabel labelDataDeLocacao = new JLabel("Data da Locacao: ");
        JLabel labelDataDeEntrega = new JLabel("Data de Entrega: ");
        JLabel labelPlaca = new JLabel("Placa : ");

        labelDataDeEntrega.setBounds(50, 40, 100, 20);
        labelTel.setBounds(50, 80, 100, 20);
        labelCpf.setBounds(50, 120, 100, 20);
        labelDataDeLocacao.setBounds(50, 160, 100, 20);
        labelPlaca.setBounds(50,100,100,20);
        MaskFormatter mascaraDataDeEntrega = null;
        MaskFormatter mascaraTel = null;
        MaskFormatter mascaraCpf = null;
        MaskFormatter mascaraDataDeLocacao = null;
        MaskFormatter mascaraPlaca = null;

        try {
            mascaraDataDeLocacao = new MaskFormatter("########");
            mascaraTel = new MaskFormatter("(##)#####-####");
            mascaraCpf = new MaskFormatter("#########-##");
            mascaraDataDeEntrega = new MaskFormatter("########");
            mascaraPlaca = new MaskFormatter("UUU-####");
            mascaraDataDeLocacao.setPlaceholderCharacter('_');
            mascaraTel.setPlaceholderCharacter('_');
            mascaraCpf.setPlaceholderCharacter('_');
            mascaraDataDeEntrega.setPlaceholderCharacter('_');
            mascaraPlaca.setPlaceholderCharacter('_');
        } catch (ParseException excp) {
            System.err.println(" erro na formatacao: " + excp.getMessage());
            System.exit(-1);
        }
        JFormattedTextField jFormattedTextCep = new JFormattedTextField(mascaraDataDeEntrega);
        JFormattedTextField jFormattedTextTel = new JFormattedTextField(mascaraTel);
        JFormattedTextField jFormattedTextCpf = new JFormattedTextField(mascaraCpf);
        JFormattedTextField jFormattedTextData = new JFormattedTextField(mascaraDataDeLocacao);
        JFormattedTextField jFormattedTextPlaca = new JFormattedTextField(mascaraPlaca);
        jFormattedTextCep.setBounds(150, 40, 100, 20);
        jFormattedTextTel.setBounds(150, 80, 100, 20);
        jFormattedTextCpf.setBounds(150, 120, 100, 20);
        jFormattedTextData.setBounds(150, 160, 100, 20);
        jFormattedTextPlaca.setBounds(150,130,100,20);
        janela.add(labelDataDeLocacao);
        janela.add(labelTel);
        janela.add(labelCpf);
        janela.add(labelDataDeEntrega);
        janela.add(labelPlaca);
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}




