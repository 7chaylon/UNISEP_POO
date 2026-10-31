public class Main{
    public static void main(String[] args) {
        FuncionarioCLT FuncionarioCLT = new FuncionarioCLT("cachorro",2000);
        FuncionarioCLT.calcularSalario();
        FuncionarioPJ FuncionarioPJ = new FuncionarioPJ("cavalo",8000);
        FuncionarioPJ.calcularSalario();
        FuncionarioEstagiario FuncionarioEstagiario = new FuncionarioEstagiario("anta",200);
        FuncionarioEstagiario.calcularSalario();

    }

}