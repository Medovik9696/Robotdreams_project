package Lesson_10;

public class University {
    public static void main(String[] args) {
        Student student1 = new Student("Dmitro","Pecherica",4,25);
        Teacher teacher1 = new Teacher("Oleh","Komarov","Computer Science",44,true);
        student1.studyStudent();
        teacher1.teach();
        student1.drinkStudent();
        teacher1.setAssessmentForStudent(student1,65);
        student1.printStudentsAssessment();
    }
}
