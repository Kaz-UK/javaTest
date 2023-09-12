package oop;

public class Runner {
    public static void main(String[] args) {
        Animal dog = new Animal();

        dog.setName("Louie");
        dog.setAge(11);
        dog.setBreed("Border Terrier dog");

        System.out.println(dog.toString());

        Animal cat = new Animal("Luna", "Persian cat", 9);

        System.out.println(cat.toString());

        System.out.println(Animal.getAnimalType());

        Animal.setAnimalType("Non-domestic pet");

        System.out.println(Animal.getAnimalType());

        System.out.println(cat);

        System.out.println(dog);

    }
}
