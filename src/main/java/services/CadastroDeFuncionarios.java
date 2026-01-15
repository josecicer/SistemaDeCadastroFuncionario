package services;

import entities.Funcionario;

import java.util.Scanner;

public class CadastroDeFuncionarios {
    public static Funcionario cadastroFuncionario(Scanner sc){
        System.out.print("Informe un Id: ");
        Integer id = sc.nextInt();

        sc.nextLine();
        System.out.print("Informe um nome: ");
        String nome = sc.nextLine();

        System.out.print("Informe um salario: ");
        Double salario = sc.nextDouble();

        Funcionario funcionario = new Funcionario(id,nome,salario);

        return funcionario;
    }

}
