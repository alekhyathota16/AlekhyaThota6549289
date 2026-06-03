    class Car {
    String make;
    String model;
    int year;

    void displayDetails() {
        System.out.println(make + " " + model + " " + year);
    }
}

public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        car.make = "Toyota";
        car.model = "Innova";
        car.year = 2020;

        car.displayDetails();
    }
}
