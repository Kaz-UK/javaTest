package oop2;

public class Car extends Vehicle {

    private int noOfDoors;

    public Car() {

    }
    public Car(int id, String name, int yearOfManufacture, double engineSize, String colour, int noOfDoors) {
        super(id, name, yearOfManufacture, engineSize, colour);
        this.noOfDoors = noOfDoors;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

}
