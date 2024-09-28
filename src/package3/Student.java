package package3;

public class Student {

    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {//-10
        if (age > 0) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        //Car car
        // car.name = "Salam"
        // car.setName() > car.name = "Salam"
    }

}
