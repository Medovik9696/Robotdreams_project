package Lesson_27;

import java.io.*;
import java.util.Scanner;

public class StringWriterAndReader {
    public static void main(String[] args) {
        writeStringToFile();
        readStringFromFile();
    }

    static void writeStringToFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a word or string: ");
        String stringWhichWrite = scanner.nextLine();
        try (FileOutputStream fileOutputStream1 = new FileOutputStream("FileWithString.txt");
             OutputStreamWriter outputStreamWriter1 = new OutputStreamWriter(fileOutputStream1)) {
            outputStreamWriter1.write(stringWhichWrite);
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }

    static void readStringFromFile() {
        try (FileInputStream fileInputStream1 = new FileInputStream("FileWithString.txt")) {
            byte[] array = fileInputStream1.readAllBytes();
            String ourString = new String(array);
            System.out.println("Your string is: " + ourString);
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}