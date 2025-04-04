public class Giraffe extends Animal {
    @Override
    public void speak() {
        hum();
    }

    public void hum() {
        System.out.println("The giraffe hums softly.");
    }
}
