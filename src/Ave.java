public abstract class Ave {
    private TipoSonido tipoSonido;
    private TipoVuelo tipoVuelo;

    public void realizaVuelo(){
        tipoVuelo.vuelo();
    }
    public void ralizaSonido(){
        tipoSonido.makeSound();
    }

    public void setTipoVuelo(TipoVuelo tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public void setTipoSonido(TipoSonido tipoSonido) {
        this.tipoSonido = tipoSonido;
    }
}
