public class Pintura extends AutomovelDecorator {

    public Pintura(Automovel automovel) {
        super(automovel);
    }

    @Override
    public float getAcrescimoPreco() {
        return 150;
    }

    @Override
    public String getAcrescimoInfo() {
        return "Pintura";
    }

}
