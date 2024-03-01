public class Main {
    public static void main(String[] args) {

        Guerreiro guerreiro = new Guerreiro("Guerreiro1", 100, 20, 30, true);
        Mago mago = new Mago("Mago1", 80, 25, 25, "Bola de Fogo");
        Arqueiro arqueiro = new Arqueiro("Arqueiro1", 90, 30, 20, true);

        Monstro monstro = new Capetao("Capetao1", 150, 15, 25);

        guerreiro.atacar(monstro);
        monstro.defender(guerreiro.ataque);
        mago.atacar(monstro);
        arqueiro.atacar(monstro);

        exibirEstadoFinal(guerreiro);
        exibirEstadoFinal(mago);
        exibirEstadoFinal(arqueiro);
        exibirEstadoFinal(monstro);
    }

    private static void exibirEstadoFinal(Personagem personagem) {
        System.out.println(personagem.nome + ": Vida = " + personagem.vida);
    }

    private static void exibirEstadoFinal(Monstro monstro) {
        System.out.println(monstro.nome + ": Vida = " + monstro.vida);
    }
}