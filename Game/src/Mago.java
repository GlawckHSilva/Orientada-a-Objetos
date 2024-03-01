class Mago extends Personagem {
    String habilidadeMagica;

    public Mago(String nome, int vida, int ataque, int defesa, String habilidadeMagica) {
        super(nome, vida, ataque, defesa);
        this.habilidadeMagica = habilidadeMagica;
    }


    @Override
    void atacar(Monstro monstro) {
        int dano = (int) (ataque * 1.5);
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