package Lesson_15_Polymorphism;

public class Pilot extends Man{
    String nameOfPlane;
    public String getNameOfPlane() {
        return nameOfPlane;
    }
    public void setNameOfPlane(String nameOfPlane) {
        this.nameOfPlane = nameOfPlane;
    }
    public void fly(){
        System.out.println("Pilot control the plane");
    };
}
