import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class IfAllGmail {
    public static void main(String[] args) throws IOException {
        System.out.print("Введите путь к файлу: "); ///home/qa-1/IdeaProjects/QaAutomatoin/src/test/java/HW.txt
        Scanner keyboard = new Scanner(System.in);
        String path = keyboard.nextLine();
        Scanner sc = new Scanner(System.in);

        String text = getTextFromFile(path);
        if (text.matches("^([\\w.+|-]+@gmail\\.com\\s*)+$"))
            System.out.println("Все емайлы - gmail");
        else
            System.out.println("У вас есть не gmail");

    }

    public static String getTextFromFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
}