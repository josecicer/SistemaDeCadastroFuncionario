package repository;

import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class RepositorioFuncionario {
    private List<Funcionario> repositorioFuncionario = new ArrayList<>();

    public RepositorioFuncionario(){

    }

    public void adicionarFuncionario(Funcionario funcionario){
        repositorioFuncionario.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario){
        repositorioFuncionario.remove(funcionario);
    }

    public List<Funcionario> listar() {
        return new ArrayList<>(repositorioFuncionario);
    }

    public Funcionario buscarFuncionarioPorId(int id){
        for (Funcionario funcionario : repositorioFuncionario){
            if (funcionario.getId().equals(id)){
                return funcionario;
            }
        }
        return null;
    }
}
