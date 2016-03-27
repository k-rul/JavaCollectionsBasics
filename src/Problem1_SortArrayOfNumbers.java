import java.util.Arrays;
import java.util.Scanner;

public class Problem1_SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nArr = new int[n];

        for (int i = 0; i < nArr.length; i++) {
            nArr[i] = in.nextInt();
        }

        Arrays.sort(nArr);

        for (int i : nArr) {
            System.out.print(i + " ");
        }
    }
}
