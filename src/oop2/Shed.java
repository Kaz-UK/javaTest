package oop2;

public class Shed<V extends Vehicle> {

    private V vehicle;

    public V getVehicle() {
        return vehicle;
    }

    public void setVehicle(V vehicle) {
        this.vehicle = vehicle;
    }
}
