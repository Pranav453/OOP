public class Car {
    
    private String color;
    private String brand;
    private String fuelType;

   
    public Car(String color, String brand, String fuelType) {
        this.color = color;
        this.brand = brand;
        this.fuelType = fuelType;
    }

    
    public void start() {
        System.out.println("The " + color + " " + brand + " is starting.");
    }

    public void stop() {
        System.out.println("The " + color + " " + brand + " has stopped.");
    }

    public void service() {
        System.out.println("The " + color + " " + brand + " is being serviced.");
    }

    
    public static void main(String[] args) {
        Car car1 = new Car("Red", "Toyota", "Petrol");
        Car car2 = new Car("Blue", "Honda", "Diesel");
        Car car3 = new Car("Black", "Tesla", "Electric");

        
        car1.start();
        car2.stop();
        car3.service();
    }
}
