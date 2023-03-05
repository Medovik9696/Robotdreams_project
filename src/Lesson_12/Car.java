package Lesson_12;

public class Car {
    static int counter=0;
    {
        String brandName;
        int numberOfWheels;
        System.out.println("Car number "+ counter + " created");
        counter++;
    }
    static {
        final int MAX_SPEED = 300;
    }
}
