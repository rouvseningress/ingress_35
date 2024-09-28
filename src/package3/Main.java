package package3;

public class Main {
    public static void main(String[] args) {
        Feature feature = new Feature("driving", "BMW", 2024);
        Car car1 = new Car(feature);

        Car car2 = new Car();
        car2.feature = new Feature(feature.name, feature.model, feature.year);

        Student student  = new Student();
    }
}
