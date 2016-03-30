import java.util.ArrayList;
import java.util.Scanner;

public class Problem7_CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] l1 = in.nextLine().split(" ");
        String[] l2 = in.nextLine().split(" ");

        ArrayList<Character> al1 = new ArrayList<>();
        ArrayList<Character> alTemp = new ArrayList<>();

        for (int i = 0; i < l1.length; i++) {
            al1.add(l1[i].charAt(0));
        }
        for (int i = 0; i < l2.length; i++) {
            if (!al1.contains(l2[i].charAt(0))) {
                alTemp.add(l2[i].charAt(0));
            }
        }
        for (int i = 0; i < alTemp.size(); i++) {
            al1.add(l2[i].charAt(0));
        }

        for (int i = 0; i < al1.size(); i++) {
            System.out.print(al1.get(i) + " ");
        }
    }
}
