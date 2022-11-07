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

    @Override
    public String getInfo() {
        return infos;
    }

    public void setInfo(String infos) {
        this.infos = infos;
    }
}
