import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConcatenarNomesSobrenomes {

    public static void main(String[] args) {
        String nomesFilePath = "C:\\Users\\Giovanna\\IdeaProjects\\Aula15\\ArquivoNomes.txt";
        String sobrenomesFilePath = "C:\\Users\\Giovanna\\IdeaProjects\\SobreNomes.txt";

        // Realizar a leitura do primeiro arquivo e exibir no console
        try (BufferedReader reader = new BufferedReader(new FileReader(nomesFilePath))) {
            String line;
            System.out.println("Nomes:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Realizar a leitura do segundo arquivo e exibir no console
        try (BufferedReader reader = new BufferedReader(new FileReader(sobrenomesFilePath))) {
            String line;
            System.out.println("\nSobrenomes:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Concatenar a informação de leitura dos dois arquivos
        try (BufferedReader nomesReader = new BufferedReader(new FileReader(nomesFilePath));
             BufferedReader sobrenomesReader = new BufferedReader(new FileReader(sobrenomesFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\caminho_completo\\NomeSobrenome.txt"))) {
            String nome, sobrenome;
            System.out.println();
            System.out.println("Nomes e Sobrenomes concatenados:");
            while ((nome = nomesReader.readLine()) != null && (sobrenome = sobrenomesReader.readLine()) != null) {
                String nomeSobrenome = nome.trim() + " " + sobrenome.trim();
                writer.write(nomeSobrenome + "\n");
                System.out.println(nomeSobrenome);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nResultado escrito no arquivo NomeSobrenome.txt.");
    }
}