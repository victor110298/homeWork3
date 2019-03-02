package sto;

public class CarWheel {
    private double stateOfWheel;

    public CarWheel() {
        this.stateOfWheel = 1.0;
    }

    public CarWheel(double stateOfWheel) {
        this.stateOfWheel = stateOfWheel;
    }

    public double changeWheel() {
        return stateOfWheel;
    }

    public void setWheelCondition(double stateOfWheel) {
        this.stateOfWheel = stateOfWheel;
    }

    public void switchWheel() {
        stateOfWheel = 1;
    }

    public void damageWheel(double percent) {
        stateOfWheel = stateOfWheel - (percent / 100);
    }

    public void printWheelCondition() {
        System.out.println("Wheel is damaged for " + (100 - stateOfWheel * 100) + " percents");
    }
}
