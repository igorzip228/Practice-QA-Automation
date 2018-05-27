import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Pattern;


public class DeleteLastD {
    public static void main(String[] args) throws IOException {
        System.out.print("Введите путь к файлу: "); ///home/qa-1/IdeaProjects/QaAutomatoin/src/test/java/HW.txt
        Scanner keyboard = new Scanner(System.in);
        String path = keyboard.nextLine();
        Scanner sc = new Scanner(System.in);

        String text = getTextFromFile(path);
        Pattern regexText = Pattern.compile("(.*)[D,d]");
        System.out.println(text.replaceAll(String.valueOf(regexText), "$1"));
    }

    public static String getTextFromFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
}
