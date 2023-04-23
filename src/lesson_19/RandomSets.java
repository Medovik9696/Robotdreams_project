package lesson_19;

import java.util.*;

public class RandomSets {
    public static void main(String[] args) {
        Set hashSet = new HashSet<Integer>();
        Set linkedHashSet = new LinkedHashSet<Integer>();
        Set treeSet = new TreeSet<Integer>();
        getRandomSet(hashSet);
        getRandomSet(linkedHashSet);
        getRandomSet(treeSet);
        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);
    }

    static void getRandomSet(Set<Integer> ourSet){
        for(int i=0; i<1000; i++) {
            Random random = new Random();
            Integer randomInt = random.nextInt(1, 50);
            ourSet.add(randomInt);
        }
    }
}
