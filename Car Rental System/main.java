// Main.java (test program)
public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        Car car1 = new Car("KAA123X", "Toyota Corolla");
        Car car2 = new Car("KBB456Y", "Honda Civic");
        agency.addCar(car1);
        agency.addCar(car2);

        Customer customer1 = new Customer("Alice", "DL12345");
        agency.addCustomer(customer1);

        System.out.println("Available Cars:");
        agency.showCars();

        System.out.println("\nRenting a car...");
        agency.rentCar("KAA123X", customer1.getLicenseNumber());

        System.out.println("\nAvailable Cars after renting:");
        agency.showCars();

        System.out.println("\nReturning a car...");
        agency.returnCar("KAA123X");

        System.out.println("\nAvailable Cars after return:");
        agency.showCars();
    }
}

