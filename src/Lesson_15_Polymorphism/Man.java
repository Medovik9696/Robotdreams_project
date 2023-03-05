package Lesson_15_Polymorphism;

public class Man  implements Drivable,Flyable{
    public static void main(String[] args) {
        Man man1 = new Man();
        Man driver1 = new Driver();
        Man pilot1 = new Pilot();
        man1.drive();
        man1.fly();
        driver1.drive();
        pilot1.fly();
    }
    String name;
    int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void drive() {
        System.out.println("Man drive the car");
    }

    @Override
    public void fly() {
        System.out.println("Man control the plane");
    }
}
