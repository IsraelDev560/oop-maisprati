package abstraction.exercises.eight;

public class Gerente extends Funcionario{
    public Gerente(String cargo,String nome,double salario, double porcentagem){
        super(cargo, nome, salario, porcentagem);
    }
    @Override
    public double calcularPagamento() {
        return this.salario;
    }
    @Override
    public double calculoBonus() {
        return porcentagem;
    }
}
