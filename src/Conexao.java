import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.FileOutputStream;

public class Conexao {
    private Scanner input = new Scanner(System.in);
    private String nome, tipo, valor, mes;
    private Destinatario origem = new Destinatario(nome, tipo, valor, mes);
    private String arquivo;

    public void cadastrarDados() {
        try {
            System.out.println("Informe o nome do arquivo: ");
            arquivo = input.nextLine();

            PrintStream escrever = new PrintStream(new FileOutputStream(arquivo, true));

            System.out.println("Informe o nome do recebedor: ");
            nome = input.nextLine();

            System.out.println("Informe o tipo da conta: ");
            tipo = input.nextLine();

            System.out.println("Informe o valor da conta: ");
            valor = input.nextLine();

            System.out.println("Informe o mês da conta: ");
            mes = input.nextLine();

            /*
             * for (int i = 0; i < 5; i++) {
             * System.out.println("Escreva algo: ");
             * String msg = input.nextLine();
             * 
             * escrever.println(msg);
             * }
             */

            escrever.println(nome);
            escrever.println(tipo);
            escrever.println(valor);
            escrever.println(mes);

            input.close();
            escrever.close();

            System.out.println("Cadastrado com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao criar o arquivo de dados!");
        }

    }

    public void listaContas() {
        try {
            System.out.println("Informe o nome do arquivo a ser acessado: ");
            arquivo = input.nextLine();

            Scanner ler = new Scanner(new FileInputStream(arquivo));

            while (ler.hasNextLine()) {
                String linha = ler.nextLine();
                System.out.println(linha);
            }

            ler.close();

        } catch (FileNotFoundException e) {
            System.out.println("O arquivo informado não foi encontrado, por favor verifique e tente novamente!");
        }
    }

}
