import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem4_LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] sArray = in.nextLine().split(" ");
        int[] iArray = Arrays.asList(sArray).stream().mapToInt(Integer::parseInt).toArray();
        String longestSequence = "";
        int lCount = 0;
        String curSeq = "";
        int cCount = 0;

        for (int i = 0; i < iArray.length; i++) {
            if (i != 0) {
                if (iArray[i] > iArray[i - 1]) {
                    curSeq = curSeq.concat(iArray[i] + " ");
                    cCount++;
                    if (i == iArray.length - 1) {
                        System.out.println(curSeq);
                        if (lCount < cCount) {
                            longestSequence = curSeq;
                        }
                    }
                } else {
                    System.out.println(curSeq);
                    if (lCount < cCount) {
                        longestSequence = curSeq;
                        lCount = cCount;
                        cCount = 0;
                    }
                    curSeq = iArray[i] + " ";
                    cCount = 1;
                }
            } else {
                curSeq = iArray[i] + " ";
                cCount++;
            }
        }
        System.out.printf("Longest: %s", longestSequence);
    }
}
