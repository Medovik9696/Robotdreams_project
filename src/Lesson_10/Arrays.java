package Lesson_10;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        int [] array1 = GetRandomArray(15);
        PrintArray(array1);
        sortArrayInAscendingOrder(array1);
        PrintArray(array1);
        sortArrayInDescendingOrder(array1);
        PrintArray(array1);
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
    static void sortArrayInAscendingOrder(int[] array){
        int temp;
        int lengthOfArray = array.length;
        for(int i=0;i<lengthOfArray-1;i++){
            for(int j=0;j<lengthOfArray-1;j++){
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }

        }
    }
    static void sortArrayInDescendingOrder(int[] array){
        int temp;
        int lengthOfArray = array.length;
        for(int i=0;i<lengthOfArray-1;i++){
            for(int j=0;j<lengthOfArray-1;j++){
                if(array[j]<array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }

        }
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
}
