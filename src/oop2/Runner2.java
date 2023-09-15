package oop2;

import oop.Runner;

import java.util.ArrayList;
import java.util.List;

public class Runner2 {

    public static void main(String[] args) {

    Plane plane1 = new Plane();
    Bird bird1 = new Bird();


    List<Flyable> toFly = new ArrayList<>();
    toFly.add(plane1);
    toFly.add(bird1);

    for (Flyable f : toFly) {
        System.out.println(f.fly());
    }


}
}