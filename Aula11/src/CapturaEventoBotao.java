import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CapturaEventoBotao implements ActionListener {

    private JButton botao;

    public void janela() {
        JFrame frame = new JFrame();
        botao = new JButton();

        botao.addActionListener(this);

        frame.getContentPane().add(botao);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setVisible(true);
        botao.setText("sou linda");
        botao.setFont(new Font("Georgia",Font.ROMAN_BASELINE,30));
    }


        public static void main(String[]args){
            CapturaEventoBotao captura = new CapturaEventoBotao();
            captura.janela();
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        botao.setText("verdade");
        botao.setFont(new Font("Palatino Linotype", Font.ITALIC,20));


    }
}

