import java.util.ArrayList;
import java.util.List;

public class Pedido {
Cliente c;
Massa m;
public double CalculaValor(){
    double valInicial = m.valor; // pegando val inicial da massa para calculo
    int qtdIngredientesEscolhidos = listaIngredientes.size(); // pegando o tamanho da lista dos ingredientes escolhidos
    double valTotalIngredientes = qtdIngredientesEscolhidos * 2;
    double valTotalPedido = valInicial + valTotalIngredientes;
    return valTotalPedido;
}
    List <Ingrediente> listaIngredientes = new ArrayList<Ingrediente>();

}