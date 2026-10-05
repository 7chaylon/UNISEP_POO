package EX_02;

public class Pais {

	String codigo;
	String nome;
	int populacao;
	double dimensao;

	Pais(String codigo, String nome, double dimensao) {
		this.codigo = codigo;
		this.nome = nome;
		this.dimensao = dimensao;


	}
	
	public void listarPais() {
		System.out.println("Codigo: " + this.codigo);
		System.out.println("Nome: " + this.nome);
		System.out.println("Dimensão: " + this.dimensao);
		System.out.println("");


	}
}