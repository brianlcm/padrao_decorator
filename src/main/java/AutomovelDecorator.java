public abstract class AutomovelDecorator implements Automovel {

    private Automovel automovel;
    public String infos;

    public AutomovelDecorator(Automovel automovel) {
        this.automovel = automovel;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    public abstract float getAcrescimoPreco();

    public float getPreco() {
        return this.automovel.getPreco() + getAcrescimoPreco();
    }

    public abstract String getAcrescimoInfo();

    public String getInfo() {
        return this.automovel.getInfo() + "/" + this.getAcrescimoInfo();
    }

    public void setInfo(String infos) {
        this.infos = infos;
    }
}
