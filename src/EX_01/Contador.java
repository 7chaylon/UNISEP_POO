package EX_01;

public class Contador {
	public int cont = 0;
	
	
	public void zerar() {
		this.cont = 0;
	};
	
	public void incrementar() {
		this.cont += 1;
	}
	
	public int retornar() {
		return this.cont++;
	}
	
}