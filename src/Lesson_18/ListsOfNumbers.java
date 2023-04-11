package Lesson_18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListsOfNumbers {
    public static void main(String[] args) {
        List<Integer> integersArrayList = new ArrayList<Integer>();
        for(int i=0; i<10; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(-50,50);
            integersArrayList.add(randomNumber);
        }
        System.out.println(integersArrayList);

        List<Integer> integersLinkedList = new LinkedList<>();
        for(int i=0; i<2000000; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(-500,500);
            integersLinkedList.add(randomNumber);
        }
    }
}
