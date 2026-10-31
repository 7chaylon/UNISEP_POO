public class FuncionarioEstagiario extends Funcionario {

    public FuncionarioEstagiario(String nome, double salarioBase){
        super(nome, salarioBase);
    };

    @Override
    public void calcularSalario(){
        super.calcularSalario();
        salarioFinal = salarioBase - (salarioBase * 0.05);
        System.out.println(" ---- FUNCIONARIO ESTAGIARIO ----");
        System.out.println( nome + " - salario base: " + salarioBase+ " - salario final: " + salarioFinal);
    }


};