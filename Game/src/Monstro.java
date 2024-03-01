abstract class Monstro {
    String nome;
    int vida;
    int ataque;
    int defesa;


    public Monstro(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }


    abstract void receberDano(Personagem personagem, int dano);


    abstract void defender(int ataqueRecebido);
}