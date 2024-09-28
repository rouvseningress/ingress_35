package package3;

import package2.Car;

public class Exercise extends Object {

    private Car car;//22

    //Instance context
    private String username;//Instance

    //Static variable: Static
    public static String password;//static


    //Instance context
    public void print() {

    }

    //Static method: Static
    public static void main(String[] args) {
        Exercise exercise = new Exercise();
        exercise.car = new Car();

        //Person > course > teacher > name
        //person = new Person()
        //person.course = new Course()
        //person.course.teacher = new Teacher();
        //person.course.teacher.name = "Rovshan"
        //sout()

        //TODO:
        // Step 1: Required!
        // Car class: Composition > Feature (fields...) > Car car1: 123
        // Feature class: String name, String model; int year;
        // 1 Car object, 1 Feature (Feature feature), Feature: fields.
        // Step 2: Optional?
        // Car car2: Copy of car1 (individual object, but features are the same)
    }
}
