public class Main {
    public static void main(String[] args) {
        Canario canario =new Canario();
        System.out.println("Canario realiza Vuelo");
        canario.realizaVuelo();
        System.out.println("Canario realiza canto");
        canario.ralizaSonido();
        canario.setTipoSonido(new Grasnido());
        System.out.println("Canario realiza sonido");
        canario.ralizaSonido();
    }
}