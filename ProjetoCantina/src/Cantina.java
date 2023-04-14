import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;

public class Cantina {

    public static void main(String[] args) {
       Pedido p = new Pedido(); // cantina atende pedidos..oq tem dentro de pedido? cliente ingrediente massa
        String cliente = JOptionPane.showInputDialog("Informe o nome do cliente: ");
        String nome_da_massa = JOptionPane.showInputDialog("Informe o nome da massa: ");
        double valor_da_massa = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da massa: "));

        Cliente c= new Cliente();
        String nome = JOptionPane.showInputDialog("nome do cliente");
        c.nome = nome;
        p.c = c;

Massa m = new Massa();
String tipoMassa = JOptionPane.showInputDialog("tipo da massa");
m.tipo = tipoMassa;
double valMassa = Double.parseDouble(JOptionPane.showInputDialog("valor da massa"));
      m.valor = valor_da_massa;
      p.m = m;


        int opcao = 0;
        Ingrediente ingrediente = new Ingrediente();
        while (opcao != 5 ){
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"informe o ingrediente desejado" +
                    ":\n1-bacon\n2-mussarela\n3-tomate\n4-queijo\n5-sair"));
      if(opcao == 1){
          ingrediente.nome = "bacon";
          p.listaIngredientes.add(ingrediente);
      }
            if(opcao == 2){
                ingrediente.nome = "mussarela";
                p.listaIngredientes.add(ingrediente);
            }
            if(opcao == 3){
                ingrediente.nome = "tomate";
                p.listaIngredientes.add(ingrediente);
            }
            if(opcao == 4){
                ingrediente.nome = "queijo";
                p.listaIngredientes.add(ingrediente);
            }
            else{

            }
        }


        }
    }
