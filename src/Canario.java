public class Canario extends Ave implements Volar{
    @java.lang.Override
    public void makeSound() {
        System.out.println("Canta");
    }

    public void vuela() {
        System.out.println("Vuela con alas");
    }
}
