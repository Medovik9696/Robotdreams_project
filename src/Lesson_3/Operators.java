package Lesson_3;

public class Operators {
    static void Addition(int x, int y){
        System.out.println("a+b = "+ (x+y));
    }
    static void Substruction(int x, int y){
        System.out.println("a-b = "+ (x-y));
    }
    static void Division(int x, int y){
        System.out.println("a/b = "+ (x/y));
    }
    static void Multiplication(int x, int y){
        System.out.println("a*b = "+ (x*y));
    }

    public static void main (String[] args){
        int a=12, b=6;
        System.out.println("a= "+ a +", b= "+ b);
        Addition(a,b);
        Substruction(a,b);
        Division(a,b);
        Multiplication(a,b);
    }


}
