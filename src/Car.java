public class Car {

    public Car() {
        super();
    }

    public String name;
    public String model;
    public int year;

    public void drive() {
        System.out.println("Driving Car");
    }

    public String toString() {
        return "Car[name: %s, model: %s, year: %d]".formatted(this.name, this.model, this.year);
    }

    //this: This point to the current Class's Instance
}
