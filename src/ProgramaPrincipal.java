import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        int opcao;
        Conexao acessoArquivos = new Conexao();
        Scanner input = new Scanner(System.in);

        System.out.println(
                "Seja bem vindo ao cadastro de contas a pagar, controle suas contas.\nSelecione a opção desejada\n1 - Cadastrar contas\n2 - Verificar contas");

        opcao = Integer.parseInt(input.nextLine());

        switch (opcao) {
            case 1:
                System.out.println("Você irá cadastrar os dados!");
                acessoArquivos.cadastrarDados();

                break;

            case 2:
                System.out.println("Listando contas...");
                acessoArquivos.listaContas();

                break;

            default:
                System.out.println("Opção inválida, tente novamente!");
                break;
        }
    }
}
