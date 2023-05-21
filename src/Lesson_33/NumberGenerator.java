package Lesson_33;

import java.util.Random;

public class NumberGenerator implements Runnable  {
    @Override
    public void run() {
        int number=0;
        while(number!=5) {
            Random random = new Random();
            number = random.nextInt(1, 10);
            System.out.println(number);
        }
    }
}
