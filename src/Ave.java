public abstract class Ave {
    TipoSonido tipoSonido;
    TipoVuelo tipoVuelo;

    public void realizaVuelo(){
        tipoVuelo.vuelo();
    }
    public void ralizaSonido(){
        tipoSonido.makeSound();
    }

}
