package Program;

import entities.Funcionario;
import repository.RepositorioFuncionario;
import services.CadastroDeFuncionarios;
import services.FuncionarioService;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        RepositorioFuncionario repositorio = new RepositorioFuncionario();
        FuncionarioService servicos = new FuncionarioService(repositorio);

        Funcionario funcionario01 = new Funcionario(10,"Jose",2100.00);
        Funcionario funcionario02 = new Funcionario(11,"Alan",2500.00);
        Funcionario funcionario03 = new Funcionario(12,"Erica",1938.00);
        Funcionario funcionario04 = new Funcionario(13,"Maria",2150.00);
        Funcionario funcionario05 = new Funcionario(14,"Anthony",2680.00);

        servicos.adicionarFuncionario(funcionario01);
        servicos.adicionarFuncionario(funcionario02);
        servicos.adicionarFuncionario(funcionario03);
        servicos.adicionarFuncionario(funcionario04);
        servicos.adicionarFuncionario(funcionario05);

        int opcao;
        char escolha;

        do {
            System.out.println("Escolha uma das opcões a seguir");

            System.out.println("1- adicionar funcionario");
            System.out.println("2- apagar funcionario");
            System.out.println("3- buscar funcionario");
            System.out.println("4- listar funcionarios");
            System.out.println("5- aumentar salario");
            System.out.println("0- sair");

            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    Funcionario funcionario = CadastroDeFuncionarios.cadastroFuncionario(sc);
                    servicos.adicionarFuncionario(funcionario);
                    break;

                case 2:
                    System.out.println("Informe um Id");
                    int id = sc.nextInt();
                    servicos.removerFuncionario(id);
                    break;

                case 3:
                    System.out.println("Informe um Id");
                    id = sc.nextInt();
                    servicos.buscarFuncionario(id);
                    break;

                case 4:
                    servicos.listarFuncionarios();
                    break;

                case 5:
                    System.out.println("Informe um Id");
                    id = sc.nextInt();

                    System.out.println("Informe uma porcentagem de aumento:");
                    Double aumento = sc.nextDouble();
                    servicos.aumentoDeSalario(id,aumento);
                    break;

                case 0:
                    System.out.println("Obrigado pela participação!");
                    return;

                default:
                    System.out.println("Valor invalido!");
                    break;
            }

            System.out.println("Deseja repetir? (s/n)");
            escolha = sc.next().toLowerCase().charAt(0);

        }while (opcao !=0 && escolha == 's');

        System.out.println("Obrigado pela participação!");
        sc.close();
    }
}
