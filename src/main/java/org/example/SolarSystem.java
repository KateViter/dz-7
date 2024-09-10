package org.example;

public enum SolarSystem {
    MERCURY(0,3,null),
    VENUS(50,6,MERCURY),
    EARTH(42,7,VENUS),
    MARS(78,4,EARTH),
    JUPITER(550,71,MARS),
    SATURN(651,60,JUPITER),
    URANUS(1446,26,SATURN),
    NEPTUNE(1622,24,URANUS),
    PLUTO(1416,2,NEPTUNE);

    private final int serialNumber;
    private final int previousDistance;
    private final int radius;
    private final SolarSystem previous;

    SolarSystem(int previousDistance, int radius, SolarSystem previous){
        this.previousDistance = previousDistance;
        this.radius = radius;
        this.previous = previous;
        this.serialNumber = this.ordinal() + 1;
    }

    public int getPreviousDistance() {
        return previousDistance;
    }

    public int getDistanceFromSun() {
        int distanceFromSun;
        if (this.ordinal() == 0){
            distanceFromSun = 6;
        }
        else {
            distanceFromSun = this.previous.getDistanceFromSun() + this.getPreviousDistance();
        }
        return distanceFromSun;
    }

    public int getRadius() {
        return radius;
    }

    public SolarSystem getPrevious() {
        return previous;
    }

    public SolarSystem getNext() {
        SolarSystem next = (values()[(ordinal() + 1) % values().length]);
        return next;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

}
