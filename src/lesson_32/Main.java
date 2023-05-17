package lesson_32;

public class Main {
    public static void main(String[] args) {
        NumberPrinter number = new NumberPrinter();
        Thread thread0 = new Thread(number);
        Thread thread1 = new Thread(number);
        thread0.start();
        thread1.start();
    }
}
