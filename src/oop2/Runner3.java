package oop2;

public class Runner3 {
    public static void main(String[] args) {

        Shed<Plane> newShed = new Shed<>();

        newShed.setVehicle(new Plane());
        Plane plane1 = newShed.getVehicle();

        System.out.println(newShed.getVehicle());


    }
}
