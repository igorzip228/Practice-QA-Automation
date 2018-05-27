import java.util.Random;
import java.util.Scanner;

public class FindInt {
    public static void main(String[] args) {
        Random rand = new Random();
        int  n = rand.nextInt(10);
        System.out.println(n);
        System.out.println("Введите число от 1 до 10 : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        while (num != n){
            System.out.println("Вы не угадали число! Попробуйте еще раз : ");
            num = in.nextInt();
        }
        System.out.println("Поздравляем! Вы угадали!");
    }
}