package Lesson_33;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator1  = new NumberGenerator();
        Thread tread = new Thread(numberGenerator1);
        tread.start();

    }
}
