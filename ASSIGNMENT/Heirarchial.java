abstract class Vehicle {
    protected String make, model, fuelType;
    protected int year;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public abstract double calculateFuelEfficiency(); // Returns km per liter
    public abstract double maxSpeed(); // Returns maximum speed in km/h

    public double distanceTraveled(double fuelUsed) {
        return calculateFuelEfficiency() * fuelUsed;
    }

    public void displayInfo() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year + ", Fuel Type: " + fuelType);
    }
}

class Truck extends Vehicle {
    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateFuelEfficiency() {
        return 5.0; // Example value for trucks
    }

    @Override
    public double maxSpeed() {
        return 120.0;
    }
}

class Car extends Vehicle {
    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateFuelEfficiency() {
        return 15.0; // Example value for cars
    }

    @Override
    public double maxSpeed() {
        return 200.0;
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateFuelEfficiency() {
        return 30.0; // Example value for motorcycles
    }

    @Override
    public double maxSpeed() {
        return 180.0;
    }
}

public class Heirarchial {
    public static void main(String[] args) {
        Vehicle truck = new Truck("Volvo", "FH16", 2022, "Diesel");
        Vehicle car = new Car("Toyota", "Camry", 2023, "Petrol");
        Vehicle motorcycle = new Motorcycle("Yamaha", "R15", 2021, "Petrol");

        truck.displayInfo();
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " km/l");
        System.out.println("Max Speed: " + truck.maxSpeed() + " km/h");
        System.out.println("Distance Traveled with 20L: " + truck.distanceTraveled(20) + " km\n");

        car.displayInfo();
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " km/l");
        System.out.println("Max Speed: " + car.maxSpeed() + " km/h");
        System.out.println("Distance Traveled with 20L: " + car.distanceTraveled(20) + " km\n");

        motorcycle.displayInfo();
        System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " km/l");
        System.out.println("Max Speed: " + motorcycle.maxSpeed() + " km/h");
        System.out.println("Distance Traveled with 20L: " + motorcycle.distanceTraveled(20) + " km");
    }
}
