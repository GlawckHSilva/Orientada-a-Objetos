class Guerreiro extends Personagem {
    boolean podePular;

    public Guerreiro(String nome, int vida, int ataque, int defesa, boolean podePular) {
        super(nome, vida, ataque, defesa);
        this.podePular = podePular;
    }

    @Override
    void atacar(Monstro monstro) {
        int dano = ataque;
        monstro.receberDano(this, dano);
    }

    @Override
    void defender(int ataqueRecebido) {
        int danoReduzido = defesa - ataqueRecebido;
        if (danoReduzido > 0) {
            vida -= danoReduzido;
            System.out.println(nome + " defendeu o ataque e sofreu dano reduzido de " + danoReduzido);
        } else {
            System.out.println(nome + " defendeu o ataque sem sofrer dano.");
        }
    }
}
