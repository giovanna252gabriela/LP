public class Pizza {
    public String nome;
    public Double valor;
    public Boolean possuiborda;

    public Double CalcularValor(Boolean possuiborda){
        if (possuiborda){
            return valor + 5.00;
        }
    return valor ;
    }
    public String getNome(){
        return nome;
    }


}
