import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Problem8_ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] Words = in.nextLine().toLowerCase().split("\\P{Alpha}+");

        Set sWords = new TreeSet<>();

        for (String word : Words) {
            sWords.add(word);
        }

        for (Object sWord : sWords) {
            System.out.print(sWord + " ");
        }
    }
}
