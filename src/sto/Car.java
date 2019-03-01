package sto;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private final String dateOfConstruction;
    private final String engineType;
    private int maxSpeed;
    private int accelerateToHundred;
    private int passengerCapacity;
    private int passengerCount;
    private int currentSpeed;
    private List<CarWheel> wheels = new ArrayList<>();
    private List<CarDoor> doors = new ArrayList<>();

    public Car(String dateOfConstruction, String engineType) {
        this.dateOfConstruction = dateOfConstruction;
        this.engineType = engineType;
    }

    public Car(String dateOfConstruction, String engineType, int maxSpeed,
               int accelerateToHundred, int passengerCapacity, int passengerCount, int currentSpeed) {
        this(dateOfConstruction, engineType);
        this.maxSpeed = maxSpeed;
        this.accelerateToHundred = accelerateToHundred;
        this.passengerCapacity = passengerCapacity;
        this.passengerCount = passengerCount;
        this.currentSpeed = currentSpeed;
    }

    public void setCurrentSpeed(int speed) {
        this.currentSpeed = speed;
    }

    public void addPassenger() {
        if (passengerCount < passengerCapacity) {
            passengerCount++;
        } else {
            System.out.println("Car is already full");
        }
    }

    public void removePassenger() {
        if (passengerCount > 0) {
            passengerCount--;
        } else {
            System.out.println("Car is already empty");
        }
    }

    public void removeAllPasengers() {
        passengerCount = 0;
    }

    public CarDoor getCarDoor(int index) {
        return doors.get(index);
    }

    public CarWheel getCarWheel(int index) {
        return wheels.get(index);
    }

    public void removeAllWheels() {
        for (CarWheel wheel : wheels) {
            wheel = null;
        }
    }

    public void setWheels(int amount) {
        for (int i = 0; i < amount; i++) {
            wheels.add(new CarWheel(1));
        }
    }

    public void calculateMaxSpeed() {
        double worstWheelCondition = 1;
        for (CarWheel wheel : wheels) {
            if (wheel.changeWheel() < worstWheelCondition) {
                worstWheelCondition = wheel.changeWheel();
            }
        }
        double speed = maxSpeed * worstWheelCondition;
        if (passengerCount == 0) {
            speed = 0;
        }
        System.out.println("Maximum speed is " + speed + " kmph.");
    }

    public void printCarInfo() {
        System.out.println("Car Information");
        System.out.println("Date of construction : " + dateOfConstruction);
        System.out.println("Type of engine : " + engineType);
        System.out.println("Maximum speed : " + maxSpeed);
        System.out.println("Time to get 100km/h : " + accelerateToHundred);
        System.out.println("Passenger capacity : " + passengerCapacity);
        System.out.println("Passengers in car : " + passengerCount);
        System.out.println("Current speed : " + currentSpeed);
        for (CarWheel wheel : wheels) {
            System.out.println("Wheel #" + wheels.indexOf(wheel));
            wheel.printWheelCondition();
        }
        for (CarDoor door : doors) {
            System.out.println("Door #" + doors.indexOf(door));
            door.printCarDoorState();
        }
        calculateMaxSpeed();
    }
}
