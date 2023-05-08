package Lesson_26;

public class Square {
    public static void main(String[] args) {
        getSquare(10);
        getSquare(-4);
        getSquare(4);
    }
    static void getSquare(int number){
        if (number<0) throw new RuntimeException(new SquareException());
        int squareOfNumber = number*number;
        System.out.println(squareOfNumber);
    }
}

class SquareException extends Exception{
    public SquareException() {
        System.out.println("Number is less than 0");
    }
}

