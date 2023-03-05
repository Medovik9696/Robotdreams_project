package Lesson_15_Polymorphism;

public class Driver extends Man{
    String nameOfCar;
    public String getNameOfCar() {
        return nameOfCar;
    }
    public void setNameOfCar(String nameOfCar) {
        this.nameOfCar = nameOfCar;
    }
    public void drive(){
        System.out.println("Driver drive the car");
    };
}
