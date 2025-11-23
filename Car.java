public class Car {
    private int id;
    private String brand;
    private String model;
    private boolean isAvailable;

    public Car(int id, String brand, String model, boolean isAvailable) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailability(boolean status) {
        this.isAvailable = status;
    }

    public void showCar() {
        System.out.println(id + " - " + brand + " " + model + 
                " | Available: " + (isAvailable ? "YES" : "NO"));
    }
}
