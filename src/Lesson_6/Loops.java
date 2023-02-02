package Lesson_6;

public class Loops {

    public static void main(String[] args) {
        PrintOneToTen();
        PrintAllEvenNumbers(100);
        PrintFactorial(7);
        PrintFibonacciNumbers();
    }
    static void PrintOneToTen(){
        int iterator=1;
        for(int i=0;i<10;i++){
            if (iterator<10)System.out.print(iterator+", ");
            else
                System.out.print(iterator);
            iterator++;
        }
        System.out.println();
    }
    static void PrintAllEvenNumbers(int n){
        for(int i=1;i<n+1;i++){
            int remainder = i%2;
            if (i<n) {if (remainder==0) System.out.print(i+", ");}
            else {if (remainder==0) System.out.print(i);}
        }
        System.out.println();
    }
    static void PrintFactorial(int n){
        int factorial=1;
        if (n<0) System.out.println("incorrect number, n<0");
        else {for (int i=1;i<=n;i++){
            factorial = factorial*i;
        }
        }
        System.out.println("Factorial " + n + " = " +factorial);
    }
    static void PrintFibonacciNumbers(){
        int firstNumbrer = 1;
        int secondNumber = 1;
        int result;
        System.out.print("0 " + firstNumbrer+ " "+secondNumber+" ");
        for(int i = 3; i <= 11; i++){
            result=firstNumbrer+secondNumber;
            System.out.print(result+" ");
            firstNumbrer=secondNumber;
            secondNumber=result;
        }
        System.out.println();
    }
}
