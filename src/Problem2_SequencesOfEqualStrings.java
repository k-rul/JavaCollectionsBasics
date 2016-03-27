import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem2_SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] s = in.nextLine().split(" ");

        for (int i = 0; i < s.length; i++) {
            if (i != 0) {
                if (s[i].equals(s[i - 1])) {
                    System.out.print(s[i] + " ");
                } else {
                    System.out.printf("%n%s ", s[i]);
                }
            } else {
                System.out.print(s[i] + " ");
            }

        }
    }
}
