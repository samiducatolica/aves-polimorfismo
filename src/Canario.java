public class Canario extends Ave {
    public Canario() {
        this.setTipoSonido(new Canto());
        this.setTipoVuelo(new VueloConAlas());
    }
}
