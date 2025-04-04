public class Elephant extends Animal {
    @Override
    public void speak() {
        trumpet();
    }

    public void trumpet() {
        System.out.println("The elephant trumpets powerfully.");
    }
}
