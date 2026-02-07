package collection;

public class Car {
    String model;
    int pricePerDay;

    Car(String model, int pricePerDay) {
        this.model = model;
        this.pricePerDay = pricePerDay;
    }

    int calculateRent(int days) {
        return days * pricePerDay;
    }

    public static void main(String[] args) {
        Car car = new Car("Honda", 1500);
        System.out.println(car.calculateRent(3));
    }
}
