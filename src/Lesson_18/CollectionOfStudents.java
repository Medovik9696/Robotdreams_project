package Lesson_18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionOfStudents {
    public static void main(String[] args) {
        List <Student>  listOfStudents = new ArrayList<>();
        Student st1 = new Student(1,"Ivan","Petrov");
        Student st2 = new Student(3,"Olga","Petrova");
        Student st3 = new Student(4,"Nikolay","Shevchenko");
        Student st4 = new Student(2,"Svetlana","Trehulova");
        Student st5 = new Student(1,"Libor","Krasny");
        listOfStudents.add(st1);
        listOfStudents.add(st2);
        listOfStudents.add(st3);
        listOfStudents.add(st4);
        listOfStudents.add(st5);
        System.out.println(listOfStudents);

        Collections.sort(listOfStudents, new CourseComparator());
        System.out.println(listOfStudents);
    }
}
class Student {
    int course;
    String name;
    String surname;

    public Student() {
    }
    public Student(int course, String name, String surname) {
        this.course = course;
        this.name = name;
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

class CourseComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.course-s2.course;
    }
}
