package Lesson_22;

import java.util.*;

public class ComparatorTest {
    public static void main(String[] args) {
        Student st1 = new Student("Marusak",9);
        Student st2 = new Student("Ivanov",7);
        Student st3 = new Student("Apehin",6);
        Student st4 = new Student("Zilberman",3);
        Student st5 = new Student("Lodov",8);
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(st1);
        studentsList.add(st2);
        studentsList.add(st3);
        studentsList.add(st4);
        studentsList.add(st5);
        System.out.println("Original list: " + studentsList);
        Collections.sort(studentsList,(s1,s2) -> s1.getSurname().compareTo(s2.getSurname()));
        System.out.println("Sorted by surname: " + studentsList);
        Collections.sort(studentsList,(s1,s2) -> s1.getAverageScore() - s2.getAverageScore());
        System.out.println("Sorted by averageScore: " + studentsList);

    }
}

class Student{
    String surname;
    Integer averageScore;

    public Student() {
    }

    public Student(String surname, Integer averageScore) {
        this.surname = surname;
        this.averageScore = averageScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(surname, student.surname) && Objects.equals(averageScore, student.averageScore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, averageScore);
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(Integer averageScore) {
        this.averageScore = averageScore;
    }
}
