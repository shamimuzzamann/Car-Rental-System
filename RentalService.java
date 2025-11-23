import java.util.Scanner;

public class RentalService {
    private Scanner sc = new Scanner(System.in);
    private CarInventory inventory;

    public RentalService(CarInventory inventory) {
        this.inventory = inventory;
    }

    public void start() {
        while (true) {
            System.out.println("\n1. View Cars");
            System.out.println("2. Rent a Car");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    inventory.displayCars();
                    break;
                case 2:
                    rentCar();
                    break;
                case 3:
                    System.out.println("Thank you for using Car Rental System!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void rentCar() {
        inventory.displayCars();
        System.out.print("Enter Car ID to rent: ");
        int id = sc.nextInt();

        Car car = inventory.getCarById(id);

        if (car == null) {
            System.out.println("Car not found.");
            return;
        }

        if (!car.isAvailable()) {
            System.out.println("Car is already rented.");
            return;
        }

        car.setAvailability(false);
        System.out.println("Car Rented Successfully!");
    }
}
