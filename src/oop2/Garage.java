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
        List<Vehicle> toRemove = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getClass().getSimpleName().equalsIgnoreCase(vehicleType)) {
                toRemove.add(vehicle);
            }
        }
        this.vehicles.removeAll(toRemove);
    }

    public void emptyGarage() {
        vehicles.clear();
    }

//    public void produceBill() {
//        for (Vehicle vehicle : vehicles) {
//            if (vehicle instanceof Car) {
//                System.out.println("Bill: " + vehicle.getName() + " Cost £" + vehicle.getId() * 2);
//            } else if (vehicle instanceof Motorbike) {
//                System.out.println("Bill: " + vehicle.getName() + " Cost £" + vehicle.getYearOfManufacture() * 2);
//            } else if (vehicle instanceof Plane) {
//                System.out.println("Bill: " + vehicle.getName() + " Cost £" + vehicle.getEngineSize() * 2);
//            } else {
//                System.out.println("Free service!");
//            }
//        }
//    }

    public double produceBill() {
        double bill = 0;
        for (Vehicle vehicle : vehicles) {
            bill += vehicle.calculateBill();
        }
        return bill;
    }

    public String toString() {
        return "Vehicle{" +
                "Vehicle in garage: " + vehicles +
                '}';
    }

    public Vehicle findById(int Id) throws VehichleNotFoundException {
        for (Vehicle v : this.vehicles) {
            if (v.getId() == Id) {
                return v;
            }
            }
            throw new VehichleNotFoundException("No vehicle with this id " + Id);

        }
}