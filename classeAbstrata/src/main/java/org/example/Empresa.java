package org.example;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private  List<Funcionario> funcionarios;

    public Empresa() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFunc(Funcionario f){
        if (f != null){
            funcionarios.add(f);
        }
    }

    public void exibeTodos(){
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }

    public void exibeTotalSalario(){
        Double total = 0.0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.calcSalario();
        }

        System.out.println("Total: " + total);
    }
}
