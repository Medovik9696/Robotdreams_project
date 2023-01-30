package Lesson_4;

public class Strings {
    static void ToUpperCase(String str){
        System.out.println("Your string in uppercase: " + str.toUpperCase());
    }
    static void ToLowerCase(String str){
        System.out.println("Your string in lowercase: "+ str.toLowerCase());

    }
    static void FirstLetter(String str){
        System.out.println("First letter in your string is: " + str.charAt(0));
    }
    static void LastLetter(String str){
        char lastLetter;
        int lastLetterIndex;
        lastLetterIndex = str.length()-1;
        lastLetter = str.charAt(lastLetterIndex);
        System.out.println("Last letter in your string is: " + lastLetter);
    }

    public static void main(String[] args) {
        String str1="MyFirstString";
        System.out.println("Your string: " + str1);
        ToUpperCase(str1);
        ToLowerCase(str1);
        FirstLetter(str1);
        LastLetter(str1);
    }
}
