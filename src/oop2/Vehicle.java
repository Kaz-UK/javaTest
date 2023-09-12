package oop2;

public abstract class Vehicle {

    private int id;
    private String name;
    private int yearOfManufacture;
    private double engineSize;
    private String colour;

    public Vehicle() {

    }

    public Vehicle (int id, String name, int yearOfManufacture, double engineSize, String colour) {
        super();
        this.id = id;
        this.name = name;
        this.yearOfManufacture = yearOfManufacture;
        this.engineSize = engineSize;
        this.colour = colour;
    }

    public abstract double calculateBill();

    public String toString() {
        return "Vehicle {" +
                "ID: " + id +
                ", name: " + name +
                ", Year of Manufacture: " + yearOfManufacture +
                ", Engine Size: " + engineSize +
                ", Colour: " + colour +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}
