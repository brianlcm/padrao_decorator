public class Aerofolio extends AutomovelDecorator {

    public Aerofolio(Automovel automovel) {
        super(automovel);
    }

    @Override
    public float getAcrescimoPreco() {
        return 500;
    }

    @Override
    public String getAcrescimoInfo() {
        return "Aerofólio";
    }

}
