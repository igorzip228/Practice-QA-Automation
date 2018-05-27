import java.util.Scanner;

public class SumOfNums {
    public static void main(String[] args) {
        System.out.println("Enter a : ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Eter b : ");
        int b = in.nextInt();
        System.out.println(add(a, b));
    }


    public static int add(int a, int b) {
        if (b == 0) return a;
        int sum = a ^ b;
        int carry = (a & b) << 1;
        return add(sum, carry);

    }
}
