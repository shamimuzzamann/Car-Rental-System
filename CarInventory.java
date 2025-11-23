public class CarInventory {
    private Car[] cars = new Car[50];
    private int count = 0;

    public void addCar(Car car) {
        cars[count] = car;
        count++;
    }

    public void displayCars() {
        System.out.println("\n--- Available Cars ---");
        for (int i = 0; i < count; i++) {
            cars[i].showCar();
        }
    }

    public Car getCarById(int id) {
        for (int i = 0; i < count; i++) {
            if (cars[i].getId() == id) {
                return cars[i];
            }
        }
        return null;
    }
}
