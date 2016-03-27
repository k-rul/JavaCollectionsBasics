import java.util.Scanner;

public class Problem3_LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] s = in.nextLine().split(" ");
        String sequence = "";
        String curSeq = "";

        for (int i = 0; i < s.length; i++) {
            if (i != 0) {
                if (s[i].equals(s[i - 1])) {
                    curSeq = curSeq.concat(s[i] + " ");
                } else {
                    curSeq = s[i] + " ";
                }
            } else {
                curSeq = curSeq.concat(s[i] + " ");
            }

            if (sequence.length() < curSeq.length()) {
                sequence = curSeq;
            }
        }
        System.out.println(sequence);
    }
}
