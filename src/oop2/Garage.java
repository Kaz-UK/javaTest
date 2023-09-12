package oop2;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle a) {
        vehicles.add(a);
    }

    public boolean removeVehicleById(int id) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == id) {
                return vehicles.remove(vehicle);
            }
        }
        return false;
    }

    public void removeVehicleByType(String vehicleType) {
        switch (vehicleType) {
            case "car":
                vehicles.removeIf(vehicle -> vehicle instanceof Car);
                break;
            case "plane":
                vehicles.removeIf(vehicle -> vehicle instanceof Plane);
                break;
            case "motorbike":
                vehicles.removeIf(vehicle -> vehicle instanceof Motorbike);
                break;
        }
    }

    public void emptyGarage() {
        vehicles.clear();
    }

    public void produceBill() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                System.out.println("Bill: " + vehicle.getName() + " Cost £" + vehicle.getId() * 2);
            } else if (vehicle instanceof Motorbike) {
                System.out.println("Bill: " + vehicle.getName() + " Cost £" + vehicle.getYearOfManufacture() * 2);
            } else if (vehicle instanceof Plane) {
                System.out.println("Bill: " + vehicle.getName() + " Cost £" + vehicle.getEngineSize() * 2);
            } else {
                System.out.println("Free service!");
            }
        }
    }

    public String toString() {
        return "Vehicle{" +
                "Vehicle in garage: " + vehicles +
                '}';
    }
}
