public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 3, "Vira-lata");

        cachorro.listarCachorro();
        cachorro.latir();

        cachorro.setNome("Bolt");
        System.out.println("Novo nome: " + cachorro.getNome());
    }
}