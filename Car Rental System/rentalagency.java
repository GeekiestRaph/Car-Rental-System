// RentalAgency.java
import java.util.ArrayList;

public class RentalAgency {
    private ArrayList<Car> cars = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();

    public void addCar(Car car) { cars.add(car); }
    public void addCustomer(Customer customer) { customers.add(customer); }

    public void rentCar(String regNo, String licenseNo) {
        for (Car car : cars) {
            if (car.getRegistrationNumber().equals(regNo) && car.isAvailable()) {
                car.rent();
                System.out.println("Car rented successfully to license " + licenseNo);
                return;
            }
        }
        System.out.println("Car not available or already rented.");
    }

    public void returnCar(String regNo) {
        for (Car car : cars) {
            if (car.getRegistrationNumber().equals(regNo) && !car.isAvailable()) {
                car.returnCar();
                System.out.println("Car returned successfully!");
                return;
            }
        }
        System.out.println("Car not found or not rented.");
    }

    public void showCars() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
