package Lesson_34;

import java.util.Random;
import java.util.concurrent.Callable;

public class NumberGeneratorCallable implements Callable<Integer> {
    @Override
    public Integer call(){
        Random random = new Random();
        Integer number = random.nextInt(1,50);
        return number;
    }
}
