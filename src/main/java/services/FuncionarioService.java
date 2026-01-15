package services;

import entities.Funcionario;
import repository.RepositorioFuncionario;

public class FuncionarioService {
    private RepositorioFuncionario servicoRepositorio;

    public FuncionarioService(RepositorioFuncionario repositorioFuncionario){
        servicoRepositorio = repositorioFuncionario;
    }

    public void adicionarFuncionario(Funcionario funcionario){

        for (Funcionario funcionario1 : servicoRepositorio.listar()){

            if (funcionario1.getId().equals(funcionario.getId())){
                System.out.println("Id ja cadastrado!");
                return;
            }
        }

        servicoRepositorio.adicionarFuncionario(funcionario);
    }

    public void removerFuncionario(int id){
        Funcionario funcionario = servicoRepositorio.buscarFuncionarioPorId(id);

        if (funcionario == null){
            System.out.println("Funcionario nao cadastrado.");
            return;
        }

        servicoRepositorio.removerFuncionario(funcionario);
    }

    public void buscarFuncionario (int id){
        Funcionario funcionario = servicoRepositorio.buscarFuncionarioPorId(id);

        if (funcionario == null){
            System.out.println("Funcionario nao cadastrado.");
            return;
        }

        System.out.println(funcionario);
    }

    public void aumentoDeSalario(int id,Double aumento){
        Funcionario funcionario = servicoRepositorio.buscarFuncionarioPorId(id);

        if (funcionario == null){
            System.out.println("Funcionario nao cadastrado.");
            return;
        }

        if (aumento <= 0){
            System.out.println("Aumento deve ser maior que zero");
            return;
        } else if (aumento > 100) {
            System.out.println("Aumento nao pode ser maior que 100");
            return;
        }

        Double novoSalario = funcionario.getSalario() + (funcionario.getSalario() * (aumento/100));

        funcionario.setSalario(novoSalario);
        System.out.println("Salario alterado com sucesso!");

    }

    public void listarFuncionarios(){
        for (Funcionario funcionario : servicoRepositorio.listar()){
            System.out.println(funcionario);
        }
    }
}
