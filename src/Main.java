public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name = "name";
        car1.model = "model";
        car1.year = 2022;
//        Car car2 = new Car("name-example");

        System.out.println(car1.toString());
//        System.out.println(car2);
    }
}

//TODO:
// toString, methods, overloading,
// Encapsulation, POJO/BEAN, @Override

// javac => java compiler > Main.java -> Main.class
// Main.class => byte codes,
// java => java Main => execute, run,
// JVM
