package package2;

public class Car {
    public String model;
    public int year;
    public int speed;


    public Car(String model, int year, int speed) {
        this.model = model;
        this.year = year;
        this.speed = speed;
        System.out.println("Car created");
    }

    public Car() {
    }

    public void increaseSpeed(int amount) {
        this.speed = speed + amount;
        System.out.println("increased speed: " + this.speed);
    }

    public void decreaseSpeed(int amount) {
        this.speed = speed - amount;
        System.out.println("decreased speed: " + this.speed);
    }

    @Override
    public String toString() {
        return "Car{"
                + "model=" + model
                + ", year=" + year
                + ", speed=" + speed
                + "}";
    }

    public static void main(String[] args) {
        Car car = new Car("BMW", 2019, 5);
        System.out.println("current: " + car);
        car.increaseSpeed(10);
        car.decreaseSpeed(3);
        System.out.println("current: " + car);
        System.out.println("7" + 7);
        System.out.println( "77710122");
//        System.out.println("7" - 7);
    }
}
