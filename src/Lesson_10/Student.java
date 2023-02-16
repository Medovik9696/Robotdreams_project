package Lesson_10;

public class Student {
    String name, surname;
    int course, age, assessment;
    Student(String name, String surname, int course, int age){
        this.name=name;
        this.surname=surname;
        this.course=course;
        this.age=age;
    }
    void studyStudent(){
        System.out.println("Student is studying");
    }
    void drinkStudent(){
        System.out.println("Student is drinking");
    }
}
