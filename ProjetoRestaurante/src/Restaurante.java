

import javax.swing.JOptionPane;

public class Restaurante {
    public static void main(String[] args) {
        String opcao= JOptionPane.showInputDialog("informe o pedido \n " + "1.Hamburguer 2.pizza 3.sair");
    if(opcao.equals("2")){
        String nome = JOptionPane.showInputDialog( " informe o nome da pizza: " );
        double valor = Double.parseDouble(JOptionPane.showInputDialog( " informe o valor da pizza: "));

        String bordaDigitada = JOptionPane.showInputDialog( " voce deseja borda? s - sim \n n -  nao ");
        Boolean bordaParaCalculo;
                if ( bordaDigitada.equals("s") ){
                    bordaParaCalculo = true;
                }
                else{
                    bordaParaCalculo = false;
                }
            Pizza p = new Pizza();
                p.nome = nome;
                p.valor = valor;

                double valorTotal = p.CalcularValor( bordaParaCalculo );
        JOptionPane.showMessageDialog( null ,"seu pedido ficou no valor de: " + valorTotal , "pedido" , JOptionPane.INFORMATION_MESSAGE);
    }
    if (opcao.equals("1")){
        String nome = JOptionPane.showInputDialog(" infome o nome do hambuguer: ");
        double valor = Double.parseDouble((JOptionPane.showInputDialog( " informe o valor do hamburguer")));

        String artesanal = JOptionPane.showInputDialog( " voce deseja hamburguer artesanal? s - sim \n n -nao");
        Boolean artesanalParaCalculo;
        if (artesanal.equals ("s")){
            artesanalParaCalculo = true;
        }
        else{
            artesanalParaCalculo  = false;
        }
        Hamburguer h = new Hamburguer();
        h.nome = nome;
        h.valor = valor;
        double valorTotal = h.CalcularValor( artesanalParaCalculo );
        JOptionPane.showMessageDialog( null ,"seu pedido ficou no valor de:" + valorTotal , "pedido" , JOptionPane.INFORMATION_MESSAGE);
    }


    }

    }


