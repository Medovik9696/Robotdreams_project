package Lesson_28;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class NIOWriterReader {
    public static void main(String[] args) {
        writeStringToFile();
        readStringFromFile();
    }

    static void writeStringToFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a word or string: ");
        String stringWhichWrite = scanner.nextLine();
        try  {
            Path pathToFile = Path.of("Word.txt");
            Files.deleteIfExists(pathToFile);
            Files.createFile(pathToFile);
            Files.writeString(pathToFile,stringWhichWrite);
        } catch (IOException e) {
            throw  new RuntimeException(e);
        }
    }

    static void readStringFromFile() {
        try  {
            Path pathToFile = Path.of("Word.txt");
            String ourString = Files.readString(pathToFile);
            System.out.println("Your string is: " + ourString);
        } catch (IOException e) {
            throw  new RuntimeException(e);
        }
    }


}
