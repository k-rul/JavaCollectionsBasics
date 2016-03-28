import java.util.Scanner;

public class Problem6_CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.nextLine().toLowerCase();
        String word = in.nextLine().toLowerCase();
        String[] splWords = text.split("\\P{Alpha}+");

        int count = 0;
        for (String splWord : splWords) {
            if (splWord.equals(word)){
                count++;
            }
        }
        System.out.println(count);
    }
}
