package oop2;

public class Runner {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setId(1);
        car1.setName("Ford Focus");
        car1.setYearOfManufacture(2023);
        car1.setEngineSize(2.3);
        car1.setColour("Blue");
        car1.setNoOfDoors(5);

        Car car2 = new Car();
        car2.setId(2);
        car2.setName("Ford Fiesta");
        car2.setYearOfManufacture(2020);
        car2.setEngineSize(2.0);
        car2.setColour("Black");
        car2.setNoOfDoors(3);

        Plane plane1 = new Plane();
        plane1.setId(3);
        plane1.setName("Airbus A320");
        plane1.setYearOfManufacture(1991);
        plane1.setEngineSize(127.3);
        plane1.setColour("White");

        Motorbike motorbike1 = new Motorbike();
        motorbike1.setId(4);
        motorbike1.setName("Honda 125");
        motorbike1.setYearOfManufacture(2021);
        motorbike1.setEngineSize(124.0);
        motorbike1.setColour("Red");

        Garage garage = new Garage();

        garage.addVehicle(car1);
        garage.addVehicle(car2);
        garage.addVehicle(plane1);
        garage.addVehicle(motorbike1);

        garage.produceBill();

        System.out.println(garage);

        // System.out.println(garage);

        // garage.removeVehicleById(2);
        garage.removeVehicleByType("car");

        System.out.println(garage);

        garage.emptyGarage();

        System.out.println(garage);

    }
}
