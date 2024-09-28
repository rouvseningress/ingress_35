package package3;

public class Car {
    Feature feature;

    public Car() {
    }

    public Car(Feature feature) {
        this.feature = feature;
    }

    public static void main(String[] args) {
        Car car = new Car();//123
        car.feature = new Feature(null, null , 0);//124
        car.feature.year = 32;
    }

    public void test() {
        System.out.println("Hello, Github!");
    }
}
