public class SumOfTwoInt {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
        int b = 7;
        ifSum(n, b);
        if (ifSum(n, b))
            System.out.println("true");
    }


    static boolean ifSum(int array[], int x) {
        for (int i = 0; i < array.length; i++)
            for (int k = i + 1; k < array.length; k++)
                if (array[i] + array[k] == x)
                    return true;
        return false;
    }
}
