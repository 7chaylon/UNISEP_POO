public class Main{
    public static void main(String[] args) {
        Soma somar = new Soma(10,20);
        somar.soma();

        Subtracao subtrair = new Subtracao(10,5);
        subtrair.subtracao();

        Multiplicacao multiplicar = new Multiplicacao(10,5);
        multiplicar.multiplicacao();

        Divisao dividir = new Divisao(10,5);
        dividir.divisao();
    }

}