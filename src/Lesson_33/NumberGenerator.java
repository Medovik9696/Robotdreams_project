package Lesson_33;

import java.util.Random;

public class NumberGenerator implements Runnable  {
    @Override
    public void run() {
        int number=0;
        while(true) {
            Random random = new Random();
            number = random.nextInt(1, 10);
            if (number==5) break;
            System.out.println(number);
        }
    }
}
