package oop;

public class Animal {
    private String name;
    private String breed;
    private int age;
    public static String animalType = "Domestic pet";

    public String toString() {
        return "This animal is a " + breed + ", their name is " + name + " and they are " + age + " years old";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1 || age > 100) {
            System.out.println("Invalid age: " + age);
        } else {
            this.age = age;
        }

    }

    public static String getAnimalType() {
        return animalType;
    }

    public static void setAnimalType(String animalType) {
        Animal.animalType = animalType;
    }

    public Animal() {

    }

    public Animal(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }


}
