public class Soma extends Calculadora {

    public Soma(double valor1,double valor2){
        super(valor1, valor2);
    }

    @Override
    public void soma(){ 
        super.soma();
        double resultado = valor1 + valor2;

        System.out.println("Resultado da soma: " + resultado);
    }

}