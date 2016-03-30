import java.util.Scanner;

public class Problem12_CalculateN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(calcFactorial(n));
    }

    private static long calcFactorial(int number) {
        if (number <= 1) {
            return  1;
        }
        return number * calcFactorial(number - 1);
    }
}
