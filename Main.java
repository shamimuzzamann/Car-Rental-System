public class Main {
    public static void main(String[] args) {
        CarInventory inventory = new CarInventory();
        RentalService rentalService = new RentalService(inventory);

        inventory.addCar(new Car(1, "Toyota", "Fortuner", true));
        inventory.addCar(new Car(2, "Honda", "City", true));
        inventory.addCar(new Car(3, "Tata", "Nexon", true));

        System.out.println("======= CAR RENTAL SYSTEM =======");
        rentalService.start();
    }
}
