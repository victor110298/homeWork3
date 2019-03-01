package sto;

public class CarDoor{
    private boolean closeDoor;
    private boolean closeWindow;


    public CarDoor() {
        closeDoor=true;
        closeWindow=true;

    }

    public CarDoor(boolean openDoor, boolean openWindow) {
        this.closeDoor = openDoor;
        this.closeWindow = openWindow;
    }

    public void openDoor(){
        if (!closeDoor){
            setDoorIsClosed(false);
        }
    }
    public void closeDoor(){
        if(!closeDoor){
            setDoorIsClosed(true);
        }
    }
    public void switchDoor(){
        setDoorIsClosed(!closeDoor);
    }
    public void openWindow() {
        if (!closeWindow) {
            setWindowIsClosed(false);
        }

    }
    public void closeWindow(){
        if(!closeWindow){
            setWindowIsClosed(true);
        }
    }
    public void switchWindow(){
        setWindowIsClosed(!closeWindow);
    }

    public boolean isDoorClosed() {
        return closeDoor;
    }

    public void setDoorIsClosed(boolean closeDoor) {
        this.closeDoor = closeDoor;
    }

    public boolean isWindowClosed() {
        return closeWindow;
    }

    public void setWindowIsClosed(boolean windowIsOpened) {
        this.closeDoor = windowIsOpened;
    }
    public void printCarDoorState() {
        System.out.println("The door now is " + (isDoorClosed() ? "closed" : "open")
                + " and window now is " + (isWindowClosed() ? "closed" : "open"));
    }

}