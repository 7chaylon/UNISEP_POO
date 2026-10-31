public class FuncionarioPJ extends Funcionario {

    public FuncionarioPJ(String nome, double salarioBase){
        super(nome, salarioBase);
    };

    @Override
    public void calcularSalario(){
        super.calcularSalario();
        salarioFinal = salarioBase + (salarioBase * 0.15);
        System.out.println(" ---- FUNCIONARIO PJ ----");
        System.out.println( nome + " - salario base: " + salarioBase+ " - salario final: " + salarioFinal);
    }


};