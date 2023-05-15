import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String nomeCliente = JOptionPane.showInputDialog(null, "Digite o nome do cliente:");

        Banco banco = new Banco(JOptionPane.showInputDialog(null, "Digite o nome do banco:"));

        try {
            BufferedReader br = new BufferedReader(new FileReader("contas.txt.txt"));

            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dadosConta = linha.split(",");
                int agencia = Integer.parseInt(dadosConta[0]);
                String numero = dadosConta[1];
                double saldo = Double.parseDouble(dadosConta[2]);

                Conta conta = new Conta(agencia, numero, saldo);
                banco.adicionarConta(conta);
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        double saldoTotal = banco.calcularSaldoTotal();

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("saldo_geral.txt"));
            bw.write("Banco " + banco.getNome() + " possui o saldo geral de contas de: " + saldoTotal);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}