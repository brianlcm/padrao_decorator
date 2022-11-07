public class Direcao extends AutomovelDecorator {

    public Direcao(Automovel automovel) {
        super(automovel);
    }

    @Override
    public float getAcrescimoPreco() {
        return 300;
    }

    @Override
    public String getAcrescimoInfo() {
        return "Direção";
    }

}
