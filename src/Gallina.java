public class Gallina extends Ave{
    public Gallina() {
        this.setTipoSonido(new Grasnido());
        this.setTipoVuelo(new VueloConAlas());
    }
}
