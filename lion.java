public class Lion extends Animal {
    @Override
    public void speak() {
        roar();
    }

    public void roar() {
        System.out.println("The lion roars loudly!");
    }
}
