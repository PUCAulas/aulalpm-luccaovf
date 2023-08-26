import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // declarando o scanner
        Scanner input = new Scanner(System.in);
        // inicializando gerador de codigos
        Random random = new Random();
        // criando objetos
        Equipamento eqp = new Equipamento();

        // atributos para addEquipamento
        String tipoEquipamento, descricao;

        int opcaoMenu = 99;
        while (opcaoMenu != 0) {
            System.out.println("-------");
            System.out.println("\n1 - Cadastrar Equipamentos");
            System.out.println("\n2 - Listar Equipamentos");
            System.out.println("\n3 - Edit Equipamentos");
            System.out.println("\n4 Remover Equipamentos");
            System.out.println("-------");

            System.out.println("\nDigite a opcao que deseja: ");
            opcaoMenu = input.nextInt();
            input.nextLine(); // limpando o buffer do teclado
            switch (opcaoMenu) {
                case 1:
                    System.out.println("\nDigite o nome do Equiapemento: ");
                    tipoEquipamento = input.nextLine();
                    System.out.println("\nDigite a descricao do Equipamento: ");
                    descricao = input.nextLine();
                    int codigoEquipamento = random.nextInt(99999999);
                    System.out.println("\nCodigo Gerado Automaticamente: " + codigoEquipamento);
                    eqp = new Equipamento(tipoEquipamento, descricao, codigoEquipamento);
                    eqp.addEquipamento(eqp);
                    break;
                case 2:
                    eqp.imprimir();
                    break;
                case 3:
                    System.out.println("\nDigite o codigo do equipamento que deseja alterar: ");
                    codigoEquipamento = input.nextInt();
                    eqp.editEquipamento(codigoEquipamento);
                    System.out.println("\nDados Alterados com sucesso");
                    break;
                case 4:
                    System.out.println("\nDigite o codigo do equipamento que deseja remover: ");
                    codigoEquipamento = input.nextInt();
                    eqp.removeEquipamento(codigoEquipamento);
                    System.out.println("\nEquipamento removido com sucesso.");
                    break;

            }
        }

    }
}
