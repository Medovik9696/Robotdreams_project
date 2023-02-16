package Lesson_10;

public class Teacher {
    String name, surname, department;
    int age;
    boolean isAssociateProfessor;
    Teacher(){}
    Teacher(String name, String surname, String department, int age, boolean isAssociateProfessor) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.age = age;
        this.isAssociateProfessor = isAssociateProfessor;
    }
    void teach(){
        System.out.println("Teacher is teaching");
    }
    void setAssessmentForStudent(Student student,int assessment){
        student.assessment=assessment;
    }
}
