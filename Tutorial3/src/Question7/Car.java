package Question7;

public class Car {
    private String licensePlate;
    private double speed; // kilometers per hour
    private double maxSpeed; // kilometers per hour
    // constructors
    public Car(String licensePlate1, double maxSpeed1) {
        this.licensePlate = licensePlate1;
        this.speed = 0.0;
        if (maxSpeed1 >= 0.0) {
            maxSpeed = maxSpeed1;
        }
        else {
            maxSpeed = 0.0;
        }
    }
    public Car(String licensePlate, double speed1, double maxSpeed1){
        this.licensePlate = licensePlate;

        if(speed1 < 0){
            this.speed = 0.0;
        }
        else if (speed1 > maxSpeed1){
            this.speed = maxSpeed1;
        }

        if (maxSpeed1 >= 0.0) {
            maxSpeed = maxSpeed1;
        }
        else {
            maxSpeed = 0.0;
        }
    }

    public void printDetails() {
        System.out.println("\nLicense Plate : " + licensePlate+"\nCurrent Speed : " + speed + "\nMax Speed : " + maxSpeed);
    }
}
