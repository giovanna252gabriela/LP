public class Divide_Exemplo02 {
    public static void main(String[] args) {
        try{
            int dividendo = Integer.parseInt(args[0]);
            int divisor = Integer.parseInt(args[1]);
            divide (dividendo, divisor);
        }catch (ArithmeticException e1){
            System.out.println(" nao pode dividir por zero");

        }
        catch (ArrayIndexOutOfBoundsException e2){
            System.out.println(" favor informar dois numeros ");
        }

        }
    public static void divide(int dividendo , int divisor){
        System.out.println(" divisão = " + (dividendo/divisor));
    }
}
