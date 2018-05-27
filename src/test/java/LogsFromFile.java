import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class LogsFromFile {
    public static void main(String[] args) throws Exception {

        //ввести путь к каталогу
        System.out.print("Please enter the path of your folder: ");
        Scanner scan = new Scanner(System.in);
        String path = scan.nextLine();
        //System.out.println(path);

        //Читаем все пути к файлам: D:\\QA Automation\\practice\\practice files\\Logs
//        File folder = new File(path);
//        processFilesFromFolder(folder);
//

//        //записываем содержимое всех файлов в список
//        ArrayList<Log> allLogs;
//
//        Log newLog = new Log(logs.substring(0, 6), logs.substring(8, 15),
////                    logs.substring(logs.indexOf("transaction") + 13));
//        for (File f : content){
//            content.add()
//        }
//
//        for (void log : processFilesFromFolder(folder);)
////        String content = new String(Files.readAllBytes(Paths.get(processFilesFromFolder(folder))));
////
////        String contents = getTextFromFile(processFilesFromFolder(folder));
//        System.out.println(contents);

        //String contents = listFilesForFolder(folder);
//        String contents = getTextFromFile(path);
//        System.out.println(contents);
//        for (String logs : severalLogs(contents)) {
//            //System.out.println(logs);
//            Log log = new Log(logs.substring(0, 6), logs.substring(8, 15),
//                    logs.substring(logs.indexOf("transaction") + 13));
//            if (!log.logText.contains(":"))
//                System.out.println(log.day + log.time + log.logText);
//        }
//    }

        //метод получения всех путей файлов с каталога и подкаталогов
//    public static void processFilesFromFolder(File folder) throws IOException {
//        File[] folderEntries = folder.listFiles();
//        for (File entry : folderEntries) {
//            if (entry.isDirectory()) {
//                processFilesFromFolder(entry);
//                continue;
//            }
//            // иначе вам попался файл, обрабатывайте его!
//            Files.lines(Paths.get(entry.getPath())).forEach(System.out::println);
//        }
//    }


////
//    public static String getTextFromFile(String fileName) throws IOException {
//        return new String(Files.readAllBytes(Paths.get(fileName)));
//    }
////
////    public static String[] severalLogs(String text) {
////        return text.split("\\n");
//
//    }
//
//
//    public static void listFilesForFolder(final File folder) throws IOException {
//        for (final File fileEntry : folder.listFiles()) {
//            if (fileEntry.isDirectory()) {
//                listFilesForFolder(fileEntry);
//            } else {
//
//                //getTextFromFile(fileEntry.getName());
//                System.out.println(fileEntry.getName());
//            }
//        }
//    }


    }


    class Log {
        String day;
        String time;
        String logText;

        Log(String d, String t, String log) {
            day = d;
            time = t;
            logText = log;
        }
    }
}
//return text.split("\\n");
