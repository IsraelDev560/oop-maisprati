package abstraction.exercises.eight;

import java.util.ArrayList;
import java.util.List;

public class FolhaDePagamento {
    private List<Funcionario> funcionarios;

    public FolhaDePagamento() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public double calcularTotalDeSalarios(){
        double total = 0;
        for (Funcionario funcionario: funcionarios){
            total += funcionario.calcularPagamento();
        }
        return total;
    }

    public double calcularTotalBonus(){
        double total = 0;
        for (Funcionario funcionario: funcionarios){
            total += funcionario.calculoBonus();
        }
        return total;
    }
}
