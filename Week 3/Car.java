public class Car {
    private String car_color;
    private String car_brand;
    private String fuel_type;
    private String mileage;

    public void start() {
        System.out.println("car is started");
    }

    public void stop() {
        System.out.println("car is stopped");
    }

    public void service() {
        System.out.println("car is for service");
    }

    public static void main(String args[]) {
        Car car = new Car();
        car.car_color = "white";
        car.car_brand = "audi";
        car.fuel_type = "petrol";
        car.mileage = "20";
        car.start();
        System.out.println("car_color: " + car.car_color + " car_brand: " + car.car_brand + "         fuel_type: " + car.fuel_type + " mileage: " + car.mileage);
        Car car1 = new Car();
	car1.car_color = "white";
        car1.car_brand = "audi";
        car1.fuel_type = "petrol";
        car1.mileage = "20";
        car1.stop();
        System.out.println("car_color: " + car1.car_color + " car_brand: " + car1.car_brand + " fuel_type: " + car1.fuel_type + " mileage: " + car1.mileage);
        Car car2 = new Car();
        car2.car_color = "white";
        car2.car_brand = "audi";
        car2.fuel_type = "petrol";
        car2.mileage = "20";
        car2.service();
        System.out.println("car_color: " + car2.car_color + " car_brand: " + car2.car_brand + " fuel_type: " + car2.fuel_type + " mileage: " + car2.mileage);
    }
}
