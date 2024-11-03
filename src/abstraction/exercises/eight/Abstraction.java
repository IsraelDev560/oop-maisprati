package abstraction.exercises.eight;


public class Abstraction {
    public static void main(String[] args) {
        FolhaDePagamento folha = new FolhaDePagamento();
        folha.adicionarFuncionario(new Desenvolvedor("Dev", "Israel", 800, 5));
        folha.adicionarFuncionario(new Estagiario("Estagiario", "Juca", 500, 3));
        folha.adicionarFuncionario(new Gerente("Gerente", "Jaques", 15550, 10));

        System.out.println("Total de Salarios: "+folha.calcularTotalDeSalarios());
        System.out.println("Total de Bonus: "+folha.calcularTotalBonus() + "%");
    }
}
