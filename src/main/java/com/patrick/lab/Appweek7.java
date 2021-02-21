package com.patrick.lab;

public class Appweek7 {
   
    public static void main(String[] args) {
        

    }
}

class Pilot {

    String name;
    int age;

    Pilot(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class MotorCycle {

    //data fields
    String color;
    int speed;

    //Creating an HAS-A relation with Pilot class
    Pilot motorCyclePilot;
    MotorCycle(String color1, int speed1, Pilot pilot) {
        this.color = color1;
        this.speed = speed1;
        this.motorCyclePilot = pilot;

    }
    void applyBrake(int decrement) {
        this.speed = decrement;
    }

    void speedUp(int increment) {
        this.speed = increment;
    }

}


class MountainMotorCycle extends MotorCycle {

    int seatHeight;

    MountainMotorCycle(String color, int speed, int seatHeight, Pilot pilot) {
        super(color, speed, pilot);
        this.seatHeight = seatHeight;
    }
    //Set a new seat height
    void setSeatHeight(int newSeatHeight){
        seatHeight = 30;
        this.seatHeight = newSeatHeight;
        if (newSeatHeight >= seatHeight) {
            System.out.println("Your mototrcycle switched to the SPORT mode (More efficient)");
        } else {
            System.out.println("Your mototrcycle switched to the NORMAL mode "); 
        }
    }
}

class RegularMotorCycle extends MotorCycle {

    RegularMotorCycle(String color, int speed, Pilot owner) {
        super(color, speed, owner);
    }
}