package Lesson_5;
    public class Conditional {
        public static void main(String[] args){
            MaxValue(5,1);
            MaxValue(5,5);
            MaxValue(1,5);
            System.out.println();
            MinValue(1,2);
            MinValue(2,2);
            MinValue(2,10);
            System.out.println();
            CheckDoubleNumber(256);
            CheckDoubleNumber(15);
        }
        static void MaxValue(int a, int b) {
            if (a > b) System.out.println("Number a=" + a + " is bigger, than b=" + b);
            else if (a<b) System.out.println("Number b=" + b + " is bigger, than a=" + a);
            else System.out.println("a equals b");

        }
        static void MinValue(int a, int b) {
            if (a < b) System.out.println("Number a=" + a + " is less, than b=" + b);
            else if (a>b) System.out.println("Number b=" + b + " is less, than a=" + a);
            else System.out.println("a equals b");

        }
        static void CheckDoubleNumber(int i){
            int remainder = i%2;
            if (remainder==1) System.out.println("Number " + i + " is odd");
            else System.out.println("Number " + i + " is even");
        }
    }


