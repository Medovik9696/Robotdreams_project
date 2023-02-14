package Lesson_8;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        int [] array1 = GetRandomArray(20);
        PrintArray(array1);
        SearchMinElementOfArray(array1);
        SearchMaxElementOfArray(array1);
        CountAverageValueOfArray(array1);
        CountSumOfArraysElements(array1);
    }

    static int[] GetRandomArray(int numberOfItems){
        int [] arrayRandomInt = new int[numberOfItems];
        for (int i=0;i<numberOfItems;i++) {
            Random random = new Random();
            int randomVal = random.nextInt(100);
            arrayRandomInt[i] = randomVal;
        }
        return arrayRandomInt;
    }
    static void PrintArray(int[]array){
        int i=0;
        System.out.print("Your array: ");
        for (int elementOfArray:array) {
            i++;
            System.out.print(elementOfArray);
            if (i<array.length)  System.out.print(", ");
            else System.out.println(".");
        }
    }
    static void SearchMinElementOfArray(int[]array){
        int minElement = array[0];
        for (int i=0;i+1<array.length;i++){
            int currentElement = array[i];
            int nextElement = array[i+1];
            if (currentElement<nextElement && minElement>currentElement) minElement=currentElement;
        }
        System.out.println("Min arrays element is: " + minElement);
    }
    static void SearchMaxElementOfArray(int[]array){
        int maxElement = array[0];
        for (int i=0;i+1<array.length;i++){
            int currentElement = array[i];
            int nextElement = array[i+1];
            if (currentElement>nextElement && maxElement<currentElement) maxElement=currentElement;
        }
        System.out.println("Max arrays element is: " + maxElement);
    }
    static void CountAverageValueOfArray(int[]array){
        int arrayLength = array.length;
        int arraySum = 0;
        double averageValue;
        for (int currentElement:array) {
            arraySum+=currentElement;
        }
        averageValue = arraySum/arrayLength;
        System.out.println("Average value is: " + averageValue);
    }
    static void CountSumOfArraysElements(int[]array){
        int arraySum = 0;
        for (int currentElement:array) {
            arraySum+=currentElement;
        }
        System.out.println("Sum is: " + arraySum);
    }
}
