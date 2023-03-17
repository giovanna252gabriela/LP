public class Hamburguer {
    public String nome;
    public double valor;
    public Boolean artesanal;

    public Double CalcularValor(Boolean artesanal) {
        if (artesanal) {
            return valor + 8.00;
        }
    return valor;
    }
    public String getNome() {
        return nome;
    }

    }

