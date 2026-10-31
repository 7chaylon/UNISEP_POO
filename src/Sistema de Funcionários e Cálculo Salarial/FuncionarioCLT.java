public class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(String nome, double salarioBase){
        super(nome, salarioBase);
    };

    @Override
    public void calcularSalario(){
        super.calcularSalario();
        salarioFinal = salarioBase - (salarioBase * 0.08);
        System.out.println(" ---- FUNCIONARIO CLT ----");
        System.out.println( nome + " - salario base: " + salarioBase+ " - salario final: " + salarioFinal);
    }


};