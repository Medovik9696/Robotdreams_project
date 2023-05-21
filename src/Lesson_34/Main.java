package Lesson_34;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Callable<Integer>> callables= new ArrayList<>();
        callables.add(new NumberGeneratorCallable());
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List <Future<Integer>> futures = executorService.invokeAll(callables);
        for (Future<Integer> fut:futures){
            System.out.println(fut.get());
        }
    }
}
