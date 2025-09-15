class Animal {
    String nome;
    String raca;
    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }
    public void comer() {
        System.out.println(nome + " está comendo.");
    }
    public void andar() {
        System.out.println(nome + " está andando.");
    }
}
class Cachorro extends Animal {
    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }
    public void latir() {
        System.out.println(nome + " está latindo: Au au!");
    }
}
class Passaro extends Animal {
    public Passaro(String nome, String raca) {
        super(nome, raca);
    }
    public void voar() {
        System.out.println(nome + " está voando.");
    }
}
public class Main {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Rex", "Pastor Alemão");
        System.out.println("Nome: " + meuCachorro.nome + ", Raça: " + meuCachorro.raca);
        meuCachorro.comer();
        meuCachorro.andar();
        meuCachorro.latir();
        System.out.println("-----");
        Passaro meuPassaro = new Passaro("Loro", "Papagaio");
        System.out.println("Nome: " + meuPassaro.nome + ", Raça: " + meuPassaro.raca);
        meuPassaro.comer();
        meuPassaro.andar();
        meuPassaro.voar();
    }
}