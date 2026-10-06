public class Cachorro extends Animal {
    private String Raca;

    public Cachorro(String Nome, int Idade, String Raca) {
        super(Nome, Idade);
        this.Raca = Raca;
    }

    public void listarCachorro() {
        super.listarAnimal();
        System.out.println("Raça: " + this.Raca);
    }

    public void latir() {
        System.out.println(this.getNome() + " está latindo: Au au!");
    }
}