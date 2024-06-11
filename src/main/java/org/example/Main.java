package org.example;

public class Main {
    public static void main(String[] args) {

        // just a loop to check all constants =)
        for (SolarSystem planet : SolarSystem.values()){
            System.out.println("--------------------------------");
            System.out.println(planet.getSerialNumber() + " - " + planet );
            System.out.println("Previous Distance - " + planet.getPreviousDistance());
            System.out.println("Distance from Sun - " + planet.getDistanceFromSun());
            System.out.println("Radius - " + planet.getRadius());
            System.out.println("Previous Planet - " + planet.getPrevious());
            System.out.println("Next Planet - " + planet.getNext());
        }
    }
}