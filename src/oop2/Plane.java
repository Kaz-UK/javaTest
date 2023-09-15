package oop2;

public class Plane extends Vehicle implements Flyable{

    public Plane() {

    }
    public Plane(int id, String name, int yearOfManufacture, double engineSize, String colour) {
        super(id, name, yearOfManufacture, engineSize, colour);
    }

    @Override
    public String fly() {
        return "nyooom";
    }

    @Override
    public double calculateBill() {
        return 10000;
    }
}
