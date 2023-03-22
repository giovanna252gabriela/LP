import javax.swing.JOptionPane;

public class PontoAcai {
    public static void main(String[] args) {

        String opcao= JOptionPane.showInputDialog("informe o pedido \n " + "1.acai  2.sair");
        if(opcao.equals("1")){
            int escolherTamanho = Integer.parseInt(JOptionPane.showInputDialog( " informe o tamanho do acai : \n " +"1.300ml \n"+
            "2.500ml \n" + "3.700 \n"));
            double valor = Double.parseDouble(JOptionPane.showInputDialog( " informe o valor da acai: "));
            String possuiacrescimo = String.valueOf(JOptionPane.showInputDialog( " voce deseja acrescimo? s - sim " +
                    "\n n -  nao "));
            Boolean Calcularacrescimo;
            if ( possuiacrescimo.equals("s") ){
                Calcularacrescimo = true;
            }
            else{
                Calcularacrescimo = false;
            }
            Acai A = new Acai();
            A.tamanho = escolherTamanho;
            A.valor = valor;

            double valorTotal = A.calcularacrescimo(Boolean.valueOf(possuiacrescimo));
            JOptionPane.showMessageDialog( null ,"seu pedido ficou no valor de: " + valorTotal ,
                    "pedido" , JOptionPane.INFORMATION_MESSAGE);
        }
        

    }
}
