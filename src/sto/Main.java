package sto;

public class Main {
    public static void main(String[] args) {
        CarDoor carDoor = new CarDoor(true, true);
        carDoor.openDoor();
        carDoor.closeDoor();
        carDoor.switchDoor();
        carDoor.openWindow();
        carDoor.closeWindow();
        carDoor.switchWindow();
        carDoor.printCarDoorState();

        CarWheel carWheel = new CarWheel(0.5);
        carWheel.changeWheel();
        carWheel.setWheelCondition(0.9);
        carWheel.switchWheel();
        carWheel.damageWheel(0.1);
        carWheel.printWheelCondition();

        Car car = new Car("1998","V8",200,2,5,4,90);
        car.setCurrentSpeed(80);
        car.addPassenger();
        car.removePassenger();
        car.removeAllPasengers();
        car.getCarDoor(5);
        car.getCarWheel(4);
        car.removeAllWheels();
        car.setWheels(4);
        car.printCarInfo();

    }
}
