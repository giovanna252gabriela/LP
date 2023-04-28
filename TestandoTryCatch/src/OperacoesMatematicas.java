import javax.swing.*;

public class OperacoesMatematicas {
    public static void main(String[] args) {
        System.out.println("inicio do programa");
        try{
            int a= Integer.parseInt(JOptionPane.showInputDialog("a:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("b:"));
            System.out.println("divisap = " + (a / b));
            System.out.println("multiplicacao= " + (a*b));
            System.out.println("soma= " +(a+b));
            System.out.println("subtracao = " +(a-b));

        }catch (ArithmeticException e1){
            System.out.println(" nao pode dividir por zero");
        }catch (NumberFormatException e2){
            System.out.println("digite um numero valido");

        }
        System.out.println(" fim do programa");
    }
}
