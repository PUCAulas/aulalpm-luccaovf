import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
   // static ArrayList<Equipamento> armazenamento = new ArrayList<>();

    static Equipamento eqp = new Equipamento();
    //static Random random = new Random();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // array dos objetos
       ArrayList<Emprestimo> arrayEmprestimo = new ArrayList<>();
        ArrayList<Cliente> arrayCliente = new ArrayList<>();
        ArrayList<Equipamento> arrayEquipamento = new ArrayList<>();

        // atributos para addEquipamento

        int opcaoMenu = 99;
        while (opcaoMenu != 0) {
            System.out.println("-------");
            System.out.println("\n1 - Cadastrar Equipamentos");
            System.out.println("\n2 - Listar Equipamentos");
            System.out.println("\n3 - Edit Equipamentos");
            System.out.println("\n4 - Remover Equipamentos");

            System.out.println("-------");

            System.out.println("\nDigite a opcao que deseja: ");
            opcaoMenu = input.nextInt();
            input.nextLine(); // limpando o buffer do teclado
            switch (opcaoMenu) {
                case 1:
                   eqp.adicionarEquipamento(input);
                    break;
                case 2:
                    eqp.listarEquipamentoP();
                    break;
                case 3:
                    eqp.editarEquipamento();
                    break;
                case 4:
                    eqp.excluirEquipamento();
                    break;
                case 5:
                    break;
                case 6:
                    break;

            }
        }

    }

    public void listarClinte(ArrayList<Cliente> arrayCliente) {
        int cont = 0;
        for (Cliente i : arrayCliente) {
            System.out.println("Numero do Cliente: " + cont + ", Nome Cliente: " + i.getNome());
            cont++;
        }
    }

    public void listarEquipamento(ArrayList<Equipamento> armazenamento) {
        int cont = 0;
        for (Equipamento i : armazenamento) {
            System.out.println("Numero do Equipamento: " + cont + ", Nome Equipamento: " + i.getTipoEquipamento()
                    + ", Descricao Equipamento: " + i.getDescricaoEquipamento());
            ;
            cont++;
        }
    }

    public void realizarAluguel(ArrayList<Emprestimo> arrayEmprestimo) {

    }

    

        

    }
