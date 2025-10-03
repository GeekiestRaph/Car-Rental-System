// Car.java
public class Car {
    private String registrationNumber;
    private String model;
    private boolean isAvailable;

    public Car(String registrationNumber, String model) {
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.isAvailable = true;
    }

    public String getRegistrationNumber() { return registrationNumber; }
    public String getModel() { return model; }
    public boolean isAvailable() { return isAvailable; }
    public void rent() { isAvailable = false; }
    public void returnCar() { isAvailable = true; }

    @Override
    public String toString() {
        return model + " (" + registrationNumber + ") - " + (isAvailable ? "Available" : "Rented");
    }
}
