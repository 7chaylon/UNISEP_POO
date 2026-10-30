public class Multiplicacao extends Calculadora {

    public Multiplicacao(double valor1,double valor2){
        super(valor1, valor2);
    }

    @Override
    public void multiplicacao(){ 
        super.multiplicacao();
        double resultado = valor1 * valor2;

        System.out.println("Resultado da Multiplicação: " + resultado);
    }

}