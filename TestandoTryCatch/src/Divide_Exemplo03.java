import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;

public class Divide_Exemplo03 {
    public static void main(String[] args) {
        int dividendo, divisor;
        while (true) {
            try {
                dividendo = Integer.parseInt((JOptionPane.showInputDialog("digite o dividendo:")));
                divisor = Integer.parseInt(JOptionPane.showInputDialog(" digite  o divisor "));
                divide(dividendo, divisor);
                break;
            } catch (ArithmeticException e1) {
                JOptionPane.showMessageDialog(null, "nao pode dividir por zero");
            } catch (NumberFormatException e2) {
                JOptionPane.showMessageDialog(null, " favor informar apenas numes inteiros");

            }
        }
    }

    public static void divide(int dividendo, int divisor) {
        System.out.println(" divisão = " + (dividendo / divisor));
    }
}
