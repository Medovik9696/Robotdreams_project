package Lesson_7;

public class Methods {
    public static void main(String[] args) {
        int cubeOfFive = GetCubeOfNumber(5);
        System.out.println("Cube 5 is equals " + cubeOfFive);
        WriteCharacters(5,'f');
        WriteCharacters(-2,'a');
        WriteStars(10);
        WriteStars(0);

    }

    static int GetCubeOfNumber(int number){
        return number*number*number;
    }
    static void WriteCharacters(int numberOfCharacters, char character){
        String result = "";
        if (numberOfCharacters<0) System.out.print("Number of characters must be positive");
        else if (numberOfCharacters==0) System.out.print("String is empty");
        else for(int i=0;i<numberOfCharacters;i++){
            result+=character;
            }
        System.out.println(result);
    }
    static void WriteStars(int numberOfStars){
        WriteCharacters(numberOfStars,'*');
    }
}
