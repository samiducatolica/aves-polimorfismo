public class Gallina extends Ave implements Volar{
    public void vuela() {
        System.out.println("Vuela con alas");
    }

    @java.lang.Override
    public void makeSound() {
        System.out.println("Grasna");
    }
}
