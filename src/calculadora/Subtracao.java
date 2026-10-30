public class Subtracao extends Calculadora {

    public Subtracao(double valor1,double valor2){
        super(valor1, valor2);
    }

    @Override
    public void subtracao(){ 
        super.subtracao();
        double resultado = valor1 - valor2;

        System.out.println("Resultado da subtração: " + resultado);
    }

}