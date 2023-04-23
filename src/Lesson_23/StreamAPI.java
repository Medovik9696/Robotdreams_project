package Lesson_23;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Surname> surnamesList = List.of(
                new Surname("Petrov"),
                new Surname("Petrov"),
                new Surname("Petrov"),
                new Surname("Petrov"),
                new Surname("Petrov"),
                new Surname("Ivanov"),
                new Surname("Ivanov"),
                new Surname("Ivanov"),
                new Surname("Konoplanko"),
                new Surname("Konoplanko"),
                new Surname("Konoplanko"),
                new Surname("Konoplanko"),
                new Surname("Konoplanko"),
                new Surname("Konoplanko"),
                new Surname("Shevchenko"),
                new Surname("Shevchenko"),
                new Surname("Shevchenko"),
                new Surname("Shevchenko"),
                new Surname("Shevchenko"),
                new Surname("Shevchenko"));
        Map<String, Long> surnamesMap = surnamesList.stream().collect(Collectors.groupingBy(Surname::getSurname,Collectors.counting()));
        System.out.println(surnamesMap);

        List<Integer> randomList = new ArrayList<>();
        for(int i=0; i<100; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(10,100);
            randomList.add(randomNumber);
            }
        System.out.println(randomList);
        Integer result = randomList.stream().reduce(0,Integer::sum);
        System.out.println("Sum is: " + result);
}
}

