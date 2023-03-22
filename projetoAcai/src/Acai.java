public class Acai {

    public Double valor;
    public Boolean possuiacrescimo;
    public int tamanho;

Object escolherTamanho(int tamanho){
        if (tamanho == 300){
            return (int) (valor + 8.00);
        }
        if  (tamanho == 500){
            return (int) (valor + 10.00);
        }
        if ( tamanho == 700){
            return (int) (valor + 12.00);
        }
        return valor;
    }

        public Double calcularacrescimo(Boolean possuiacrescimo) {
        if (possuiacrescimo) {
            return valor + 2.00;
        }
return valor;

    }
}
