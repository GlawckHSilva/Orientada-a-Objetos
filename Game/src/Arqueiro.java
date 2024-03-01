class Arqueiro extends Personagem {
    boolean podeEsquivar;

    public Arqueiro(String nome, int vida, int ataque, int defesa, boolean podeEsquivar) {
        super(nome, vida, ataque, defesa);
        this.podeEsquivar = podeEsquivar;
    }

    @Override
    void atacar(Monstro monstro) {
        int dano = (int) (ataque * 1.2);
        monstro.receberDano(this, dano);
    }

    @Override
    void defender(int ataqueRecebido) {
        if (podeEsquivar && Math.random() < 0.3) {
            System.out.println(nome + " esquivou do ataque!");
        } else {
            int danoReduzido = defesa - ataqueRecebido;
            if (danoReduzido > 0) {
                vida -= danoReduzido;
                System.out.println(nome + " defendeu o ataque e sofreu dano reduzido de " + danoReduzido);
            } else {
                System.out.println(nome + " defendeu o ataque sem sofrer dano.");
            }
        }
    }
}