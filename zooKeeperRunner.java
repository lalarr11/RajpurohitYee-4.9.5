import java.util.ArrayList;

public class ZooKeeperRunner {
    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<>();

        zoo.add(new Giraffe());
        zoo.add(new Lion());
        zoo.add(new Elephant());

        for (Animal animal : zoo) {
            animal.speak();  // Calls the correct method based on object type
        }

        // Call hearTheAnimal method with different animals
        hearTheAnimal(new Giraffe());
        hearTheAnimal(new Lion());
        hearTheAnimal(new Elephant());
    }

    public static void hearTheAnimal(Animal currentAnimal) {
        currentAnimal.speak(); // Calls the overridden speak method dynamically
    }
}
